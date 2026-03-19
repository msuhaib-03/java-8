package stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


        // ====== FEW EXAMPLES ======
        // 1) Counting occurences of character:
        String sentence = "Hey, I'm Suhaib and I'm learning Java Stream API with lambda expressions.";
        long count = sentence.chars().filter(x -> x == 'i').count(); // we use chars() method to convert the string into an IntStream of characters, then we filter the stream to keep only the characters that are equal to 'i', and finally we count the number of elements in the filtered stream.
        System.out.println("Count Occurences Stream: " + count); // Output: 5

        // 2) Summing Values:
        List<Integer> sum = List.of(8,12,99,34,67);
        Integer i2 = sum.stream().reduce(Integer::sum).get();
        System.out.println("Summing Values Stream: " + i2); // Output: 220

        // 3) Square Values and Sort:
        Stream<Integer> sorted = sum.stream().map(x -> x * x).sorted();
        System.out.println("Square Values and Sort Stream: ");
        sorted.forEach(System.out::println); // Output: 64, 144, 1156, 4489, 1089


        // There are other 2 operations: stateless and stateful.
        // Stateless operations are operations that do not depend on the state of the stream and can be executed in parallel. They are intermediate operations that return a new stream. Examples: filter, map.
        // Stateful operations are operations that depend on the state of the stream and cannot be executed in parallel. They are intermediate operations that return a new stream. Examples: sorted, distinct, limit, skip.
    }
}
