package labxx.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractionTest {
    @Test
    void testSubtractPositive() {
        Subtraction calc = new Subtraction();
        assertEquals(1.0, calc.subtract(3.0, 2.0));
    }

    @Test
    void testSubtractNegative() {
        Subtraction calc = new Subtraction();
        assertEquals(5.0, calc.subtract(2.0, -3.0));
    }
}