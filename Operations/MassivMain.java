package Operations;

import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

public class MassivMain {
    public static void main(String[] args) {

      /* System.out.print("Задайте размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
               arr[i] = sc.nextInt();
        {System.out.println(Arrays.toString(arr));
        }
        { for (int i = 1; i < arr.length; i++,i++)
         System.out.println(arr[i]);
    }*/


     /*  System.out.print("Задайте размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while (i < arr.length) {
            arr[i] = sc.nextInt();
            i++;
        }
        {
            for (int a = 1; a < arr.length; a++, a++)
                System.out.println(arr[a]);
        }
    }
}*/


     /* System.out.print("Задайте размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        do {
            arr[i] = sc.nextInt();
            i++;
        }
        while (i < n);

        {
            for (int a = 1; a < arr.length; a++, a++)
                System.out.println(arr[a]);
        }
    }
}*/


       System.out.print("Задайте размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i : arr) {
            arr[i] = sc.nextInt();

            System.out.println(arr[i]);
        }

        for (int a = 1; a < arr.length;a++,a++ ) {
            System.out.println(arr[a]);
        }

    }
}


