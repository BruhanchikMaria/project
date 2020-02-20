package Decorator;

import CalculatorWithOperator.CalculatorWithCounter;

public class CounterDecorator implements IBase{

    CalculatorWithOperator.CalculatorWithCounter calcObj;

    public CounterDecorator(CalculatorWithCounter calcObj) {
        this.calcObj = calcObj;

    }

   @Override
    public double plus(double a, double b) {
        return a+b;
    }

    @Override
    public double minus(double a, double b) {
        return a-b;
    }

    @Override
    public double mul(double a, double b) {
        return a*b;
    }

    @Override
    public double div(double a, double b) {
        return a/b;
    }

}
