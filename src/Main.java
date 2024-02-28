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
        for (int i1 = 0; i1 < 10; i1++) {
            if (i1 == orr.length - 1) {
                System.out.print(orr[i1]);
            }
        }
        System.out.println();
        System.out.println("   ");
        int[] glass = new int[11];
        System.out.print(Arrays.toString(glass));
        System.out.println();


        System.out.println(" Задача №1.1");
        int[] arr1 = new int[12];
        for (int q = 0; q < arr1.length; q++) {
            System.out.print(arr1[q] + " ");
        }
        System.out.println();
        System.out.println("Задача 1.2");
        double[] arr2 = {1.57, 7.654, 9.986};
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + " ");
        }
        System.out.println();
        System.out.println(" Задача 1.3");
        int[] arr3 = new int[5];
        arr3[0] = 5;
        for (i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        System.out.println("Задача 2.1");
        for (int q = 0; q < arr1.length; q++) {
        }
        System.out.print(Arrays.toString(arr1));

        System.out.println();
        System.out.println("задача 2.2");
        for (double j = 0; j < arr2.length; j++) {
        }
        System.out.print(Arrays.toString(arr2));

        System.out.println();
        System.out.println(" Задача 2.3");
        arr3[0] = 5;
        for (i = 0; i < arr3.length; i++) {
        }
        System.out.print(Arrays.toString(arr3));

        System.out.println();
        System.out.println(" Задача 3.1");
        arr1[11] = 12;
        for (i = 11; i >= 0; i--) {
        }
        System.out.print(Arrays.toString(arr1));

        System.out.println();
        System.out.println("Задача 3.2");
        for (double q = 2; q >= 0; q--) {
        }
        System.out.print(Arrays.toString(arr2));

        System.out.println();
        System.out.println(" Задача 3.3");
        for (i = 4; i >= 0; i--) {
        }
        System.out.print(Arrays.toString(arr3));

        System.out.println();
        System.out.println(" Задача 4.1 ");
        int[] books = {1, 2, 3, 4, 5, 6, 7, 8, 10, 12};
        for (i = 0; i < books.length; i++)
            if (books[i] % 2 != 0) {
                books[i] = books[i] + 1;
            }

        System.out.println(Arrays.toString(books) + " ");


    }





    }
