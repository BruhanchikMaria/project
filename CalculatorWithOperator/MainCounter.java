package CalculatorWithOperator;

public class MainCounter {

    public static void main(String[] args) {
        ICalc calcOperation=new CalculatorWithOperator();
        CalculatorWithMath calcObject = new CalculatorWithMath();
        CalculatorWithCounter calcObj = new CalculatorWithCounter(calcObject);
        Decorator CounterDeco=new NewDecorator(calcOperation);



        double result = CounterDeco.plus(CounterDeco.plus(4.1, CounterDeco.mul(15, 7)), CounterDeco.step(calcObj.div(28, 5), 2));
        System.out.println("количество операций: " + CounterDeco.getCounter());

        System.out.println(result);
    }
}
