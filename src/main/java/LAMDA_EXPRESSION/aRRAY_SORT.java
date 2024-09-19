package LAMDA_EXPRESSION;


import java.util.Arrays;

public class aRRAY_SORT {
    public static void main(String args[]) {
        //2D ARRAY SORTING
        //int[][] arr=new int[5][3];
        double[][] A = {{2, 3, 4}, {1, 6, 11}, {4, 8, 2}, {2, 4, 9}, {8, 4, 10}};
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j]+"  ");
            }
            System.out.print("\n");
        }
        System.out.println("after sorting");


        //Arrays.sort(A, (a, b) -> ((b[0] - a[0])>0?1:-1));
        Arrays.sort(A, (a, b) -> ((a[0] - b[0])>0?1:-1));
        System.out.print("\n");
        System.out.print("\n");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }

}
