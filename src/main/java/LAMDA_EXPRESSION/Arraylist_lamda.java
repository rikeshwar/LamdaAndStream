package LAMDA_EXPRESSION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist_lamda {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        //for(int i=0;i<3;i++)
        A.add(new ArrayList<>(List.of(4, 18, 14)));
        A.add(new ArrayList<>(List.of(24, 86, 71)));
        A.add(new ArrayList<>(List.of(64, 89, 19)));
        A.add(new ArrayList<>(List.of(41, 58, 21)));
        Collections.sort(A,(a,b)-> {
            return a.get(2) - b.get(2);
        });
        for(int i=0;i<4;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A.get(i).get(j) + "   ");
            }

            System.out.println();
        }
        System.out.println("******************");
        for(ArrayList<Integer> x:A)
        {
            for(int y:x)
                System.out.print(y+"  ");
            System.out.println();
        }

        ArrayList<ArrayList<Double>> B = new ArrayList<>();
        //for(int i=0;i<3;i++)
        B.add(new ArrayList<>(List.of(4.3, 18.1, 14.4)));
        B.add(new ArrayList<>(List.of(24.33, 86.44, 71.55)));
        B.add(new ArrayList<>(List.of(64.11, 89.15, 19.67)));
        B.add(new ArrayList<>(List.of(41.33, 58.98, 21.67)));
        Collections.sort(B,(a,b)-> {
            return (int)(a.get(2) - b.get(2));//here since value souble be int
            //as to interpret as boolean value to make decision on swap
        });

        for(ArrayList<Double> x:B)
        {
            for(double y:x)
                System.out.print(y+"  ");
            System.out.println();
        }

    }

}
