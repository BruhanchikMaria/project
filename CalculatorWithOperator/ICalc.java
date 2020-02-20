package CalculatorWithOperator;

public interface ICalc {



    public static double step(double div, int b){
        double result = 1;
        for (double i=1; i<=b; i++){
            result = result*i;
        }
        return result;
    }

    public  double plus(double a,double b);
    public  double minus(double a,double b);
    public  double mul(double a,double b);
    public  double div(double a,double b);
}
