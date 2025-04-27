package labxx.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivisionTest {
    @Test
    void testDivideNormal() {
        Division calc = new Division();
        assertEquals(2.0, calc.divide(4.0, 2.0));
    }

    @Test
    void testDivideByZero() {
        Division calc = new Division();
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> calc.divide(4.0, 0.0)
        );
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
