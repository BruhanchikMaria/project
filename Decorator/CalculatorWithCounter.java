package Decorator;

import CalculatorWithOperator.CalculatorWithMath;
import CalculatorWithOperator.CalculatorWithOperator;

public class CalculatorWithCounter extends CalculatorWithMath implements IBase {
    private CalculatorWithOperator calc;
    private CalculatorWithMath calc2;
    private int count;

    public void IBase(CalculatorWithCounter calc2) {
        this.calc2 = calc2;
    }

    public CalculatorWithCounter(CalculatorWithOperator calc) {
        this.calc = calc;
    }

    public CalculatorWithCounter(CalculatorWithMath calc) {
        this.calc2 = calc;
    }


    public double plus(double a, double b) {
        this.count++;
        return a + b;
    }

    public double minus(double a, double b) {
        this.count++;
        return a - b;
    }

    public double mul(double a, double b) {
        this.count++;
        return a * b;
    }

    public double step(double a, double b) {
        this.count++;
        return Math.pow(a, b);
    }


    public double div(double a, double b) {
        this.count++;
        if (b != 0.0) {
            return Math.round(a / b);
        } else {
            System.out.println("На 0 делить нельзя!");
            return Double.NaN;
        }
    }

    public int getCount() {
        return count;
    }


}
