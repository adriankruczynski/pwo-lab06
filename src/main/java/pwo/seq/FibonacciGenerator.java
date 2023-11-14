package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa do generowania ciągu Fibonacciego.
 * Ciąg Fibonacciego to ciąg liczb, gdzie każda liczba jest sumą dwóch poprzednich liczb, zaczynając od 0 i 1.
 * Jest to klasyczny przykład ciągu używanego w różnych dziedzinach matematyki i informatyki.
 *
 * @author adriankruczynski
 */
public class FibonacciGenerator extends Generator {

    /**
     * Konstruktor klasy FibonacciGenerator.
     * Inicjalizuje ciąg wartościami początkowymi dla ciągu Fibonacciego (0 i 1).
     */
    public FibonacciGenerator() {
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Resetuje generator do stanu początkowego ciągu Fibonacciego.
     * Resetuje stan generatora do wartości początkowych ciągu (0 i 1).
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Generuje i zwraca następny termin ciągu Fibonacciego.
     * Jeśli indeks ostatniego terminu (lastIndex) jest większy niż 1, oblicza termin poprzez sumowanie dwóch poprzednich terminów.
     * W przeciwnym razie zwraca 0 lub 1, w zależności od wartości lastIndex.
     *
     * @return Następny termin ciągu Fibonacciego jako BigDecimal.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }

        lastIndex++;
        return current;
    }
}
