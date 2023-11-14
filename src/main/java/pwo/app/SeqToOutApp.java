/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.app;

import pwo.utils.SequenceTools;

/**
 * Aplikacja konsolowa do wypisywania ciągów numerycznych na standardowe wyjście (terminal).
 * Dziedziczy po klasie SeqToFileApp, rozszerzając jej funkcjonalność o wypisywanie ciągów.
 * Używa narzędzi z pakietu pwo.utils do generowania i formatowania ciągów.
 *
 * @author adriankruczynski
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     * Analizuje i weryfikuje argumenty linii poleceń.
     * Metoda ta rozszerza metodę getArgs z klasy bazowej SeqToFileApp.
     * Sprawdza, czy typ ciągu (seqType) jest zdefiniowany i czy zakresy (from, to) są poprawne.
     *
     * @param args Argumenty linii poleceń.
     * @return true jeśli argumenty są prawidłowe, w przeciwnym razie false.
     */
    @Override
    protected boolean getArgs(String[] args) {
        if(super.getArgs(args)) return true;
        return seqType != null && from >= 0 && to >= 0;    
    }

    /**
     * Wypisuje ciąg numeryczny na standardowe wyjście (terminal).
     * Używa SequenceTools.getTermsAsColumn do generowania i formatowania ciągu.
     *
     * @return Zawsze zwraca true.
     */
    @Override
    protected boolean wirteSeq() {
        System.out.println(SequenceTools.getTermsAsColumn(
        seqType.getGenerator(), from, to));

        return true;
    }

    /**
     * Metoda uruchamiająca aplikację.
     * Wyświetla informację o aplikacji, a następnie przetwarza argumenty i wypisuje ciąg.
     * Wyświetla błąd, jeśli argumenty są nieprawidłowe.
     *
     * @param args Argumenty linii poleceń.
     */
    @Override
    public void run(String[] args) {
        System.out.println("Sequence to terminal CLI app");

        if (!getArgs(args)) {
            System.out.println("!Illegal arguments\n" + "Legal usage: seqName from to");
            return;
        }

        wirteSeq();
    }
}
