package ComplexNumberCalculator;

//Класс ComplexNumber 
public class ComplexNumber {
  //Класс ComplexNumber содержит два поля: действительную (a) и мнимую (b) части
    public double a; 
    public double b; 

    public ComplexNumber(double a, double b) {
      this.a = a;
      this.b = b;
    }

    @Override
    public String toString() {
      if (this.a == 0)
        return this.b + "i";
      if (this.b == 0)
        return this.a + "";
      if (this.b < 0)
        return this.a + "" + this.b + "i";
      return this.a + "+" + this.b + "i";
    }
  
  }