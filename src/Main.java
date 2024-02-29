import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Массивы ");
        int[] weights = {90, 91, 93, 92, 88, 34, 43, 56, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i] + " ");
        }
        System.out.println();
        int[] bigBox = {10, 20, 30};
        System.out.println(bigBox[0]);

        System.out.println();
        int[] arr = {5, 7, 8};
        int i = arr[2];
        System.out.println(i);
        for (int i1 = 0; i1 < 3; i1++) {
            arr[1] = i + 1;
            System.out.println(i);
        }
        System.out.println(" Задача из конспекта 1");

        int[] orr = new int[10];
        for (int i1 = 0; i1 < orr.length; i1++) {
            if (i1 == orr.length - 1) {
                System.out.print(orr[i1]);
            }
        }
        System.out.println();
        System.out.println("   ");
        int[] glass = new int[11];
        System.out.print(Arrays.toString(glass));
        System.out.println();


        System.out.println(" Задача №1");
        int[] arr1 = new int[3];
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = new int[5];

        System.out.println(" Задача 2");
        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = j + 1;
            System.out.print(arr1[j]);
            if (j < arr1.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int q = 0; q < arr2.length; q++) {
            System.out.print(arr2[q] + " ");
            if (q < arr2.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int q = 0; q < arr3.length; q++) {
            System.out.print(arr3[q] + " ");
            if (q < arr3.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        System.out.println( "Задание 3");
        for (int j = arr1.length -1 ; j >= 0  ; j--) {
            System.out.print(arr1[j]);
            if (j > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int j = arr2.length -1 ; j >= 0  ; j--) {
            System.out.print(arr2[j]);
            if (j > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int q = arr3.length -1 ; q >= 0  ; q--) {
            System.out.print(arr3[q]);
            if (q > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        System.out.println( " Задача №4 ");
        for (int j = 0; j < arr1.length; j++) {
            if (arr1[j] % 2 != 0) {
                arr1[j] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
