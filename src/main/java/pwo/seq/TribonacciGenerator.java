 package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa do generowania ciągu Tribonacciego, która rozszerza klasę FibonacciGenerator.
 * Ciąg Tribonacciego jest podobny do ciągu Fibonacciego, lecz każdy termin jest sumą trzech poprzednich terminów ciągu.
 * 
 * @author adriankruczynski
 */
public class TribonacciGenerator extends FibonacciGenerator {

    /**
     * Konstruktor klasy TribonacciGenerator.
     * Inicjalizuje trzeci termin ciągu (f_3) na wartość 0, co jest niezbędne do rozpoczęcia generowania ciągu.
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
     * Resetuje generator do stanu początkowego.
     * Resetuje zarówno stan z klasy bazowej FibonacciGenerator, jak i stan specyficzny dla TribonacciGenerator (f_3).
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    /**
     * Generuje i zwraca następny termin ciągu Tribonacciego.
     * Jeśli indeks ostatniego terminu (lastIndex) jest większy niż 2, oblicza termin poprzez sumowanie trzech poprzednich terminów.
     * W przeciwnym razie zwraca 0 lub 1, w zależności od wartości lastIndex.
     * 
     * @return Następny termin ciągu Tribonacciego jako BigDecimal.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        }
        else if (lastIndex == 2) { current = new BigDecimal(1); }
        else { current = new BigDecimal(0); }
        lastIndex++;
        return current;
    }
}
