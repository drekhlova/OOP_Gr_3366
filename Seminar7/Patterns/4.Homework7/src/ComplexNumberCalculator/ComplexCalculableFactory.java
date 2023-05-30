package ComplexNumberCalculator;

//Класс ComplexNumberCalculator
public class ComplexCalculableFactory implements iCalculableFactory {

    @Override
    public iCalculable create(ComplexNumber primaryArg) {
        return new ComplexCalculator(primaryArg);
    }
}