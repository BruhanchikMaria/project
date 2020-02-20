package Decorator;

import CalculatorWithOperator.CalculatorWithCounter;

public class NewDecorator extends CounterDecorator{

    public NewDecorator(CalculatorWithCounter calcObj) {
        super(calcObj);
    }
    public String makeNameMethod (){
        return "Метод суммы";
    }
    public String makeNameMethod2 (){
        return "Метод разности";

    }
    public String makeNameMethod3 (){
        return "Метод произведения";

    }
    public String makeNameMethod4 (){
        return "Метод частного";

    }

    @Override
    public double minus(double a, double b) {
        System.out.println(makeNameMethod2());
        return super.minus(a, b);
    }

    @Override
    public double mul(double a, double b) {
        System.out.println(makeNameMethod3());
        return super.mul(a, b);
    }

    @Override
    public double div(double a, double b) {
        System.out.println(makeNameMethod4());
        return super.div(a, b);
    }

    @Override
    public double plus(double a, double b) {
        System.out.println(makeNameMethod());
        return super.plus(a, b);

    }
}
