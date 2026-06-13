public class BasicCalculator {
    
    /**
     * Adds two numbers
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Subtracts two numbers
     * @param a first number
     * @param b second number
     * @return difference between a and b
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplies two numbers
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * Divides two numbers
     * @param a dividend
     * @param b divisor
     * @return quotient of a divided by b
     * @throws ArithmeticException if division by zero is attempted
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}