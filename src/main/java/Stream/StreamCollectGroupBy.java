package Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectGroupBy {
    public static void main(String[] args) {

        Map<String, List<Integer>> map= Stream.of(2,5,6,8,1,11,23,44)
                .collect(Collectors.groupingBy(
                        x->x%2==0?"evenNumber":"oddNumber"
                ));
        System.out.println(map);

        System.out.println(Stream.of(1, 4, 7, 11, 88, 33, 100)
                .collect(Collectors.groupingBy(x -> x > 10)));
    }
}
