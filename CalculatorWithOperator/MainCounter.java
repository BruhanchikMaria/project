package CalculatorWithOperator;

   public class MainCounter {

       public static void main(String[] args) {

           CalculatorWithMath calcObject = new CalculatorWithMath();
           CalculatorWithCounter calcObj =new CalculatorWithCounter(calcObject);

       double result=calcObj.plus(calcObj.plus(4.1,calcObj.mul(15,7)),calcObj.step(calcObj.div(28,5),2));
           System.out.println("количество операций: "+calcObj.getCount());
    }
}
