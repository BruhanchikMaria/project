package CalculatorWithOperator;

public class CalculatorWithMath extends CalculatorWithOperator implements ICalc {


    public double step(double a, double b){
        return Math.pow(a, b);
    }


    public double modul(double a) {
        return Math.abs(a);

    }

    public double koren(double a) {
        return Math.sqrt(a);

    }

}
