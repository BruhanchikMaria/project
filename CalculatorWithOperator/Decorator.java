package CalculatorWithOperator;

public abstract class Decorator implements ICalc {
  protected ICalc icalc;

  Decorator(ICalc icalc){
      this.icalc=icalc;
  }


    public abstract double step(double div, int b);


    public abstract double plus(double a, double b);


    public abstract double minus(double a, double b);


    public abstract double mul(double a, double b);


    public abstract double div(double a, double b);

    public abstract int getCounter();


}
