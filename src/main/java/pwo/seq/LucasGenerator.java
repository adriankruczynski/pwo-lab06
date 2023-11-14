package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa do generowania ciągu Lucasa, która rozszerza klasę FibonacciGenerator.
 * Ciąg Lucasa jest podobny do ciągu Fibonacciego, ale zaczyna się od 2 i 1 zamiast od 0 i 1.
 * Ciąg ten ma zastosowania w różnych dziedzinach matematyki, w tym w teorii liczb.
 * 
 * @author adriankruczynski
 */
public class LucasGenerator extends FibonacciGenerator {

    /**
     * Konstruktor klasy LucasGenerator.
     * Inicjalizuje ciąg wartościami początkowymi specyficznymi dla ciągu Lucasa.
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Resetuje generator do stanu początkowego ciągu Lucasa.
     * Resetuje zarówno stan z klasy bazowej FibonacciGenerator, jak i stan specyficzny dla LucasGenerator.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Generuje i zwraca następny termin ciągu Lucasa.
     * W przypadku, gdy indeks ostatniego terminu (lastIndex) wynosi 0, zwraca 2 jako początkowy termin ciągu Lucasa.
     * W pozostałych przypadkach, wykorzystuje metodę nextTerm z klasy bazowej do generowania terminów.
     * 
     * @return Następny termin ciągu Lucasa jako BigDecimal.
     */
    @Override
    public BigDecimal nextTerm() {
        if(lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }
}
