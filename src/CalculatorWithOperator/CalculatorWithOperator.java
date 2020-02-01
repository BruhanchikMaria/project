package CalculatorWithOperator;

public  class CalculatorWithOperator {
   double a;
   double b;

    public static void step(double div, int b) {
    }

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
                 return Math.round(a/b);
             } else {
                 System.out.println("На 0 делить нельзя!");
                 return Double.NaN;
             }
    }

    public  double step(int a, int b){
        double result = 1;
        for (double i=1; i<=b; i++){
            result = result*a;
        }
        return result;
    }

     public  double modul(double a) {
         if (a<0) {
             a = a * (-1);
         }

         return a;
     }
    public double koren(int a,int b) {
        return (double) (a^1/b);

     }



        }



