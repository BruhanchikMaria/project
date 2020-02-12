package Sortirovka;

import java.util.Arrays;
import java.util.Scanner;

public class SortirovkiMain {
    public static void main(String[] args) {

        System.out.print("Задайте размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        {
            System.out.println(Arrays.toString(arr));
        }
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;


            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                    if (i != min_i) {
                        int tmp = arr[i];
                        arr[i] = arr[min_i];
                        arr[min_i] = tmp;
                    }
                }
            }

        public static void removeDuplicates(int[] values) {
            boolean mask[] = new boolean[values.length];
            int removeCount = 0;

            for (int i = 0; i < values.length; i++) {
                if (!mask[i]) {
                    int tmp = values[i];

                    for (int j = i + 1; j < values.length; j++) {
                        if (tmp == values[j]) {
                            mask[j] = true;
                            removeCount++;
                        }
                    }
                }
            }

            int[] result = new int[values.length - removeCount];

            for (int i = 0, j = 0; i < values.length; i++) {
                if (!mask[i]) {
                    result[j++] = values[i];
                }
            }
            System.out.println(Arrays.toString(result));

        }
    }
             }


       /* for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));




        Sheikernii.shekerSort (arr, n); // вызываем функцию сортировки
        // Выводим отсортированные элементы массива
        for (int i = 0; i<n; i++){
            System.out.print(arr[i]);
        }*/



    }}