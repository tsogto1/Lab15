package labxx.sict.must.edu.mn;

/**
 * Performs division operations
 */
public class Division {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}