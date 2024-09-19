package LAMDA_EXPRESSION;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2d {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] A = {{3, 7}, {8, 1}, {5, 10}};
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        /*
        Arrays.sort(A, (int a[], int b[]) -> {
            return a[1] - b[1];
        });*/
        //we can also try without datatype
        Arrays.sort(A, (a,b) -> {
            return a[0] - b[0];
        });
        for (int[] x : A) {
            for (int y : x)
                System.out.print(y + " ");
            System.out.println();
        }
        System.out.print("============================");

        double[][] B = {{3.5, 7.2}, {8.7, 1.2}, {5.1, 10.9}};
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        /*Arrays.sort(B, (double[] a, double[] b) -> {
            return (int) (a[1] - b[1]);
        });*/
        Arrays.sort(B, ( a,b) -> {
            return (int) (a[0] - b[0]);
        });
        for(double[] x:B) {
            for (double y : x)
                System.out.print(y+" ");
            System.out.println();
        }


    }


}


