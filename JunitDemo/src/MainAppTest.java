import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    private BasicCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new BasicCalculator();
    }

    // Addition tests
    @Test
    @DisplayName("Test addition with positive numbers")
    void testAddPositiveNumbers() {
        assertEquals(5.0, calculator.add(2.0, 3.0), "2 + 3 should equal 5");
    }

    @Test
    @DisplayName("Test addition with negative numbers")
    void testAddNegativeNumbers() {
        assertEquals(-1.0, calculator.add(2.0, -3.0), "2 + (-3) should equal -1");
    }

    // Subtraction tests
    @Test
    @DisplayName("Test subtraction with positive result")
    void testSubtractWithPositiveResult() {
        assertEquals(2.0, calculator.subtract(5.0, 3.0), "5 - 3 should equal 2");
    }

    @Test
    @DisplayName("Test subtraction with negative result")
    void testSubtractWithNegativeResult() {
        assertEquals(-2.0, calculator.subtract(3.0, 5.0), "3 - 5 should equal -2");
    }

    // Multiplication tests
    @ParameterizedTest
    @DisplayName("Test multiplication with various inputs")
    @CsvSource({
        "2.0, 3.0, 6.0",
        "5.0, 0.0, 0.0",
        "-2.0, 4.0, -8.0"
    })
    void testMultiply(double a, double b, double expected) {
        assertEquals(expected, calculator.multiply(a, b), 
            () -> a + " * " + b + " should equal " + expected);
    }

    // Division tests
    @Test
    @DisplayName("Test division with normal inputs")
    void testDivideNormalCase() {
        assertEquals(2.5, calculator.divide(5.0, 2.0), "5 / 2 should equal 2.5");
    }

    @Test
    @DisplayName("Test division by zero")
    void testDivideByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, 
            () -> calculator.divide(5.0, 0.0),
            "Division by zero should throw ArithmeticException");
        
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @ParameterizedTest
    @DisplayName("Test division with various inputs")
    @CsvSource({
        "10.0, 2.0, 5.0",
        "9.0, 3.0, 3.0",
        "1.0, 4.0, 0.25"
    })
    void testDivideMultipleCases(double a, double b, double expected) {
        assertEquals(expected, calculator.divide(a, b), 
            () -> a + " / " + b + " should equal " + expected);
    }
}