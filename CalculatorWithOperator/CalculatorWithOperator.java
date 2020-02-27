package CalculatorWithOperator;

public class CalculatorWithOperator implements ICalc {
    private double a;
    private double b;


    public double step(double div, int b) {
        double result = 1;
        for (double i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    public double plus(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;


    }
}





