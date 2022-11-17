import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberCalculatorTest {

    @Test
    @DisplayName("Test isPrime on common prime / non prime values")
    void isPrime() {
        assertEquals(true, PrimeNumberCalculator.isPrime(2));
        assertEquals(true, PrimeNumberCalculator.isPrime(101));
        assertEquals(false, PrimeNumberCalculator.isPrime(-3));
        assertEquals(false, PrimeNumberCalculator.isPrime(99));
    }

    @Test
    @DisplayName("Test getPrimeFactorization on several numbers of varying size")
    void getPrimeFactorization() {
        assertEquals("5 * 11 ", PrimeNumberCalculator.getPrimeFactorization(55));
        assertEquals("2 * 3 * 29 ", PrimeNumberCalculator.getPrimeFactorization(174));
        assertEquals("2 * 3 * 73309 ", PrimeNumberCalculator.getPrimeFactorization(439854));
        assertEquals("3 * 3 * 41 * 271 ", PrimeNumberCalculator.getPrimeFactorization(99999));
        assertEquals("3 * 5 * 823 ", PrimeNumberCalculator.getPrimeFactorization(12345));

    }
}
