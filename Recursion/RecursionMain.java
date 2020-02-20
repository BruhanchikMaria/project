package Recursion;


public class RecursionMain {
    public static void main(String[] args) {


        String s="1811142833";
        String sArr[]=s.split("");
        int numArr[]=new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            numArr[i] = Integer.parseInt(sArr[i]);
            System.out.println(numArr[i]);

            rec(0,numArr);
        }

    }

    private static int  rec(int i, int[] numArr) {
        if (i==(numArr.length-1))
        return numArr[i];
        return numArr [i]*rec(i+1,numArr);
    }

}

