package CalculatorWithOperator;

import CalculatorWithOperator.CalculatorWithOperator;

public class Main {
    public static void main(String[] args) {
        CalculatorWithOperator calcObject = new CalculatorWithOperator();

        double div = calcObject.div(28, 5);
        double mul = calcObject.mul(15, 7);

        double step = calcObject.step((int) div, 2);
        double plus = calcObject.plus(mul, step);
        double plus2 = calcObject.plus(4.1, plus);
        System.out.println(plus2);
       // double result =calcObject.div(plus2,0);
        //double result =calcObject.div(plus2,0.0d);


    }
}
