package ComplexNumberCalculator;

//Интерфейс для описания поведения ComplexCalculator
public interface iCalculable {
    iCalculable sum(ComplexNumber arg); //сложение
    iCalculable multi(ComplexNumber arg); //умножение
    iCalculable divide(ComplexNumber arg); //деление
    ComplexNumber getResult(); //результат
}