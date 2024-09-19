package LAMDA_EXPRESSION;

import java.util.Collections;
import java.util.PriorityQueue;
class graph{
    int weight;
    int node;
    graph(int weight,int node)
    {
        this.weight=weight;
        this.node=node;

    }


}

public class parityQue_lamda {
    public static void main(String args[])
    {
        PriorityQueue<graph> pq=new PriorityQueue<>((a,b)->{
            return b.weight-a.weight;
        });
        pq.add(new graph(20,1));
        pq.add(new graph(15,2));
        pq.add(new graph(22,3));
        pq.add(new graph(9,4));



       System.out.println(pq.peek().node+"   "+pq.peek().weight);
       pq.remove();
       System.out.println(pq.peek().weight+" "+pq.peek().node);
    }
}
