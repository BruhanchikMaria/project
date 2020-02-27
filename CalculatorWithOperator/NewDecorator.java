package CalculatorWithOperator;

public class NewDecorator extends Decorator{
  public int counter=0;
    public NewDecorator(ICalc icalc) {
        super(icalc);
    }

    @Override
    public double step(double div, int b) {
        counter++;
        return icalc.step(div,b);
    }

    @Override
    public double plus(double a, double b) {
        counter ++;
        return icalc.plus(a, b);
    }

    @Override
    public double minus(double a, double b) {
        counter ++;
        return icalc.minus(a, b);
    }

    @Override
    public double mul(double a, double b) {
        counter ++;
        return icalc.mul(a, b);
    }

    @Override
    public double div(double a, double b) {
        counter ++;
        return icalc.div(a, b);
    }

    public int getCounter(){
        return counter;
    }

}

