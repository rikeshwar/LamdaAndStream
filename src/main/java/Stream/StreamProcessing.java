package Stream;

import java.util.stream.Stream;

public class StreamProcessing {
    public static void main(String[] args) {
        Stream<Integer> stream=Stream.of(3,2,5,7);
        stream.filter(x->x>3).forEach(System.out::println);

        //stream.map(x->x*x).forEach(System.out::println);
        //stream.map(x->Math.pow(x,3)).filter(z->z<100).forEach(System.out::println);
        //running all three will throw exception as Stream is immutable and here could
        //be prodessed only once so you can process anyone of them and once

        Stream.of(34,12,76,90).map(x->x-50).filter(x->x>0).forEach(System.out::println);

    }
}
