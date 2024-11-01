import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        calculator.add(5);
        assertEquals(5, calculator.getResult(), "Adding 5 should result in 5");
    }

    @Test
    public void testSubtraction() {
        calculator.subtract(3);
        assertEquals(-3, calculator.getResult(), "Subtracting 3 should result in -3");
    }

    @Test
    public void testMultiplication() {
        calculator.add(2);  // Initialize to 2
        calculator.multiply(3);
        assertEquals(6, calculator.getResult(), "Multiplying 2 by 3 should result in 6");
    }

    @Test
    public void testExponentiation() {
        calculator.add(2);  // Initialize to 2
        calculator.exponent(3);
        assertEquals(8, calculator.getResult(), "Raising 2 to the power of 3 should result in 8");
    }
}