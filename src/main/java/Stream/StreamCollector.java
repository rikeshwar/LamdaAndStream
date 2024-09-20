package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollector {
    public static void main(String[] args) {
        List<Integer> list=Stream.of(2,5,7,9,1,-3,-5,-7)
                .filter(x->x>0).collect(Collectors.toList());
        System.out.println(list);

        List<String> stringList=Stream.of("tiger","lion","Panther")
                .collect(Collectors.joining()).lines().toList();
        System.out.println(stringList);

        System.out.println(Stream.of("tiger", "lion", "Panther")
                .collect(Collectors.joining(",")));

        String string=Stream.of("tiger","lion","Panther")
                .collect(Collectors.joining(","));//joining return string
        System.out.println(string);

        System.out.println(Stream.of("tiger", "lion", "Panther")
                .collect(Collectors.joining(",", "{", "}")));


        Map<Integer,String> map=Stream.of(3,5,8,1,9,9)//duplicate will give error
                //so use distinct will internally apply a filter to remove duplicate
                .distinct()
                .collect(Collectors.toMap(
                        x->x, x->"Number "+x
                ));
        System.out.println(map);

        long count=Stream.of("tiger","lion","Panther")
                .collect(Collectors.counting());//return long
        System.out.println(count);
        System.out.println(Stream.of("tiger", "lion", "Panther")
                .collect(Collectors.counting()));

        Set<Integer> set=Stream.of(2,7,9,11,45,80,243)
                .map(x->x*x).filter(x->x<500)
                .collect(Collectors.toSet());
        System.out.println(set);


    }
}
