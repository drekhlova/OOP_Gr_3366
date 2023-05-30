package ComplexNumberCalculator;

// Класс LogCalculator, включающий логирование
public class LogCalculator implements iCalculable {
    private iCalculable decorated;
    private iLoggable logger;

    public LogCalculator(iCalculable decorated, iLoggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public iCalculable sum(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора " + firstArg + ". Начало вызова метода sum с параметром " + arg);
        iCalculable result = decorated.sum(arg);
        logger.log(String.format("Вызова метода sum произошел."));
        return result;
    }

    @Override
    public iCalculable multi(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора " + firstArg + ". Начало вызова метода multi с параметром " + arg);
        iCalculable result = decorated.multi(arg);
        logger.log(String.format("Вызова метода multi произошел."));
        return result;
    }

    @Override
    public iCalculable divide(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора " + firstArg + ". Начало вызова метода divide с параметром " + arg);
        iCalculable result = decorated.divide(arg);
        logger.log(String.format("Вызова метода divide произошел."));
        return result;
    }

    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = decorated.getResult();
        logger.log("Получение результата = " + result);
        return result;
    }
}