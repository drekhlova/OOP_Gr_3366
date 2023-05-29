package ComplexNumberCalculator;

public class CalculableFactory implements iCalculableFactory {
    @Override
    public ComplexCalculable create(ComplexNumberCalculator primaryArg) {
        return new ComplexCalculator(primaryArg);
    }
}