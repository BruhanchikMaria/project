package CalculatorWithOperator;

import Decorator.IBase;

public class CalculatorWithCounter implements ICalc{
    private CalculatorWithOperator calc;
    private CalculatorWithMath calc2;
    private int count;

    public CalculatorWithCounter(CalculatorWithMath calc) {
        this.calc2 = calc;
    }

    public CalculatorWithCounter(CalculatorWithOperator calc) {
        this.calc = calc;
    }


    public double step(double div, int b) {
        return calc.step(div, b);
    }

    public double plus(double a, double b) {
        this.count++;
        return calc.plus(a, b);
    }

    public double minus(double a, double b) {
        this.count++;
        return calc.minus(a, b);
    }

    public double mul(double a, double b) {
        this.count++;
        return calc.mul(a, b);
    }

    public double div(double a, double b) {
        this.count++;
        if (b != 0.0) {
            return calc.div(a, b);
        } else {
            return Double.NaN;
        }
        }
    public int getCount () {
        return count;
    }


}
