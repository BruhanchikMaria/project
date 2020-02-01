package CalculatorWithOperator;

public class CalculatorWithCounter {
    private CalculatorWithOperator a;
            private CalculatorWithMath b;
            private int count;
    public CalculatorWithCounter(CalculatorWithOperator) {
        this.a=a;
    }
            public CalculatorWithCounter(CalculatorWithMath){
        this.b=b;
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
                        return Math.round(a / b);
                    } else {
                        System.out.println("На 0 делить нельзя!");
                        return Double.NaN;
                    }
                 public void setCountOperation(int count){
                        this.count=count;
                        public int getCountOperation(){
                            return count;
                        }
                        }


                  }
}


}