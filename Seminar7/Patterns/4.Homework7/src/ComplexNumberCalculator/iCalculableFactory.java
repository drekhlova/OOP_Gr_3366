package ComplexNumberCalculator;

// Интерфейс для описания поведения ComplexCalculableFactory
public interface iCalculableFactory {
    iCalculable create(ComplexNumber primaryArg);
}