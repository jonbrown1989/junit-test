import jdk.jfr.StackTrace;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    //@Test
    //@DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    //@Test
    //@DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
    }

    @org.junit.jupiter.api.Test
    void testMultiply() {
    }
}
