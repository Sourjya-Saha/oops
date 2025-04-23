package mathops;

public class Divide {
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}
