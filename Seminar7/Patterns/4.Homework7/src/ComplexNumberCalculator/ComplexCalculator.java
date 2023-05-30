package ComplexNumberCalculator;

//Класс ComplexCalculator
public final class ComplexCalculator implements iCalculable {
    private ComplexNumber primaryArg;

    //Конструктор класса принимает параметром первый аргемент primaryArg для вычисления
    public ComplexCalculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public iCalculable sum(ComplexNumber arg) {
        primaryArg.a += arg.a;
        primaryArg.b += arg.b;
        return this;
    }

    @Override
    public iCalculable multi(ComplexNumber arg) {
        ComplexNumber resultMultiply = new ComplexNumber(0, 0);
        resultMultiply.a = primaryArg.a * arg.a - primaryArg.b * arg.b;
        resultMultiply.b = primaryArg.a * arg.b + primaryArg.b * arg.a;
        primaryArg.a = resultMultiply.a;
        primaryArg.b = resultMultiply.b;
        return this;
    }

    @Override
    public iCalculable divide(ComplexNumber arg) {
        ComplexNumber resultMultiply = new ComplexNumber(0, 0);
        resultMultiply.a = (primaryArg.a * arg.a + primaryArg.b * arg.b) / (arg.a * arg.b + arg.b * arg.b);
        resultMultiply.b = (primaryArg.b * arg.a - primaryArg.a * arg.b) / (arg.a * arg.a + arg.b * arg.b);
        primaryArg.a = Math.round(resultMultiply.a * 100.0) / 100.0;
        primaryArg.b = Math.round(resultMultiply.b * 100.0) / 100.0;
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }
}