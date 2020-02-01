package CalculatorWithOperator;

public class CalculatorWithMath {
    double a;
    double b;

    public  double plus(double a,double b) {
        return a + b;
    }
    public  double minus(double a,double b) {
        return a - b;
    }
    public  double mul(double a,double b) {
        return a * b;
    }
    public  double div(double a,double b) {

        if (b != 0.0) {
            return Math.floor(a/b);
        } else {
            System.out.println("На 0 делить нельзя!");
            return Double.NaN;
        }
    }


        public double step (double a,double b){
            return Math.pow(a, b);
        }


    public  double modul(double a) {

        return Math.abs(a);
    }
    public double koren(double a) {
        return Math.sqrt(a);

    }

}
