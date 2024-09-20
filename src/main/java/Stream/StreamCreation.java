package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(2,5,1,9,6));

        //form list
        Stream<Integer> stream=list.stream();
        //direct way
        Stream<String> stringStream=Stream.of("ram","shyam","mohan");
        stringStream.forEach(System.out::print);

        int[] arr=new int[]{3,67,12,78};
        //from Arrays.
        Stream<Integer> arrStream= Arrays.stream(arr).boxed();
        Integer[] IntArr=new Integer[]{2,5,12,887,3};
        Stream<Integer> ArrStream=Arrays.stream(IntArr);//here boking not Required

        IntStream boxedStream= Arrays.stream(arr);//inbuilt boking
        boxedStream.forEach(System.out::println);





    }


}
