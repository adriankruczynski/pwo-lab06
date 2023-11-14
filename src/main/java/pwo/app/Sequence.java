package pwo.app;

/**
 * Główna klasa aplikacji służącej do generowania ciągów numerycznych.
 * Obsługuje różne rodzaje ciągów i zapisuje wyniki do strumienia wyjściowego lub pliku.
 * Wybór operacji i rodzaju ciągu jest determinowany przez argumenty linii poleceń.
 *
 * @author student
 */
public class Sequence {

    /**
     * Główna metoda aplikacji.
     * Analizuje argumenty linii poleceń i na ich podstawie decyduje, którą aplikację uruchomić:
     * SeqToOutApp dla trzech argumentów (wypisuje ciąg na standardowe wyjście) lub
     * SeqToFileApp dla czterech argumentów (zapisuje ciąg do pliku).
     * Wyświetla komunikat o błędzie, jeśli liczba argumentów jest nieprawidłowa.
     *
     * @param args Argumenty linii poleceń. Oczekiwane użycie:
     *             3 argumenty - nazwa ciągu, początek zakresu, koniec zakresu
     *             4 argumenty - jak wyżej, plus nazwa pliku do zapisu
     */
    public static void main(String[] args) {
        switch (args.length) {
            case 3: 
                (new SeqToOutApp()).run(args); 
                break;
            case 4: 
                (new SeqToFileApp()).run(args); 
                break;
            default: 
                System.out.println("!Illegal arguments\n" + "Legal usage: seqName from to [fileName]");
        }
    }
}
