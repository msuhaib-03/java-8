package stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Terminal_Operations {
    public static void main(String[] args) {
        // Terminal operations are operations that trigger the processing of the stream and produce a result or a side effect. They are eager, meaning they will execute immediately when called. They are used to produce a result or a side effect from a stream.

        List<Integer> numbers = List.of(4,5,1,3,2);
        // 1) Collect & toList: It is used to collect the elements of a stream into a collection such as List, Set, Map etc. It is a terminal operation that triggers the processing of the stream and produces a result or a side effect.
        List<Integer> collect = numbers.stream().skip(1).toList();
        System.out.println("Collect Stream: " + collect); // Output: [5, 1, 3, 2]

        // 2) ForEach: It is used to perform an action for each element of a stream. It is a terminal operation that triggers the processing of the stream and produces a result or a side effect.
        numbers.stream().forEach(System.out::println);

        // 3) Reduce: Also called Accumulator. It is used to perform a reduction on the elements of a stream using an associative accumulation function and returns an Optional describing the reduced value, if any. It is a terminal operation that triggers the processing of the stream and produces a result or a side effect.
        Optional<Integer> reduce = numbers.stream().reduce((x,y) -> x +y); // this can be changes to method reference like .reduce(Integer::sum);
        System.out.println("Reduce Stream: " + reduce.get()); // Output: 15

        // 4) Count: It is used to count the number of elements in a stream. It is a terminal operation that triggers the processing of the stream and produces a result or a side effect.

        // 5) anyMatch, allMatch, noneMatch --> Also called short-circuit operations. They are used to check if any, all or none of the elements of a stream match a given predicate. They are terminal operations that trigger the processing of the stream and produce a result or a side effect.
        boolean anyMatch = numbers.stream().anyMatch(x -> x > 3);
        System.out.println("Any Match Stream: " + anyMatch); // Output: true
        boolean b = numbers.stream().noneMatch(x -> x > 3);
        System.out.println("None Match Stream: " + b); // Output: false
        boolean b1 = numbers.stream().allMatch(x -> x > 3);
        System.out.println("All Match Stream: " + b1); // Output: false

        // 6) findFirst, findAny: --> Also called short-circuit operations. They are used to find the first or any element of a stream that matches a given predicate. They are terminal operations that trigger the processing of the stream and produce a result or a side effect.
        Integer i = numbers.stream().findAny().get();
        System.out.println("Find Any Stream: " + i); // Output: 4 (or any other element)

        Integer i1 = numbers.stream().findFirst().get();
        System.out.println("Find First Stream: " + i1); // Output: 4
    }
}
