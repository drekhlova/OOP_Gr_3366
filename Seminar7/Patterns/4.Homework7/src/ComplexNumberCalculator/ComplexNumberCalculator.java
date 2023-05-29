package ComplexNumberCalculator;

public class ComplexNumberCalculator {
    private double a;
    private double b;

    public ComplexNumberCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return String.format("%f + i*%f", a, b);
    }
}
