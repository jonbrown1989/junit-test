import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciCalculatorTest {

    @Test
    @DisplayName("Test isFibonacciNumber on known Fibonacci numbers and numbers known not to be Fibonacci numbers")
    void isFibonacciNumber() {
        assertEquals(true, FibonacciCalculator.isFibonacciNumber(5));
        assertEquals(true, FibonacciCalculator.isFibonacciNumber(55));
        assertEquals(false, FibonacciCalculator.isFibonacciNumber(56));
        assertEquals(false, FibonacciCalculator.isFibonacciNumber(-5));

    }

    @Test
    @DisplayName("Test getFibonacciNumber on given positional values")
    void getFibonacciNumber() {
        assertEquals(0, FibonacciCalculator.getFibonacciNumber(1));
        assertEquals(1, FibonacciCalculator.getFibonacciNumber(3));
        assertEquals(21, FibonacciCalculator.getFibonacciNumber(9));
    }
}