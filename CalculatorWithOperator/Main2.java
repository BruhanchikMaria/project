package CalculatorWithOperator;

public class Main2 {
           public static void main(String[] args) {
               CalculatorWithMath math = new CalculatorWithMath();


               double div = math.div(28, 5);
               double mul = math.mul(15, 7);

               double step = math.step((int) div, 2);
               double plus = math.plus(mul, step);
               double plus2 = math.plus(4.1, plus);
               System.out.println(plus2);
               //double result =math.div(plus2,0);
              // double result =math.div(plus2,0.0d);
           }}

