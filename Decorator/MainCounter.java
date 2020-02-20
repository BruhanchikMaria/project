package Decorator;

import CalculatorWithOperator.CalculatorWithCounter;
import CalculatorWithOperator.CalculatorWithMath;
import CalculatorWithOperator.CalculatorWithOperator;

public class MainCounter {
    public static void main(String[] args) {


        CalculatorWithMath calcObject = new CalculatorWithMath();
        CalculatorWithCounter calcObj = new CalculatorWithCounter(calcObject);
      //  IBase base=new NewDecorator(new CounterDecorator(new CalculatorWithCounter()));

     /*   double result = calcObj.plus(calcObj.plus(4.1, calcObj.mul(15, 7)), calcObj.step(calcObj.div(28, 5), 2));
        System.out.println("количество операций: " + calcObj.getCount());*/



        double div = calcObj.div(28, 5);
        double mul = calcObj.mul(15, 7);

        double step = calcObj.step((int) div, 2);
        double plus = calcObj.plus(mul, step);
        double plus2 = calcObj.plus(4.1, plus);
        System.out.println(plus2);

    }
}
