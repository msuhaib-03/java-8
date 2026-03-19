package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intemediate_Operations {
    public static void main(String[] args) {
        // Transform a stream into another stream
        // They are lazy, meaning they won't execute until a terminal operation is involved.
        // Filter takes predicate which holds a condition & causes intermediate operations.

        // 1) Filter: It takes a predicate and returns a stream that contains only the elements that match the predicate.
        List<String> names = List.of("Amie", "Amjad", "Rabz");
        Stream<String> a = names.stream().filter(x -> x.startsWith("A"));
        System.out.println("Filter Stream: ");
        // Now this stream won't work until we associate terminal operation with it like .count() or .forEach() etc.
        System.out.println(a.count()); // Output: 2

        // 2) Map: It takes a function and returns a stream that contains the results of applying the function to the elements of the original stream.
        List<Integer> numbers = List.of(4,5,1,3,2);
        numbers.stream().map(x -> x*x).filter(x -> x%2==0).forEach(System.out::println);
        System.out.println("Map Stream: ");
        System.out.println(numbers);

        // 3) Sorted: It returns a stream that contains the elements of the original stream sorted according to natural order or a specified comparator.
        Stream<Integer> sorted = numbers.stream().sorted();
        System.out.println("Sorted Stream: ");
        sorted.forEach(System.out::println);

        // 4) Distinct: It returns a stream that contains the distinct elements of the original stream.
        long count = numbers.stream().filter(x -> x % 3 == 0).distinct().count();
        System.out.println("Distinct Stream: ");
        System.out.println(count); // Output: 1

        // 5) Limit: It returns a stream that contains the first n elements of the original stream.
        System.out.println("Limit Stream: ");
        numbers.stream().limit(3).forEach(System.out::println);

        // 6) Skip: It returns a stream that contains the elements of the original stream except the first n elements.
        System.out.println("Skip Stream: ");
        numbers.stream().skip(3).forEach(System.out::println);

        // 7) Peak: It returns a stream that contains the elements of the original stream, but also allows us to perform an action on each element as it is consumed from the stream. It is useful for debugging and logging purposes.
        long count1 = Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();
        System.out.println("Peek Stream: " + count1); // Output: 100

        // 8) flatMap: Handles stream of collections, lists or arrays where each element is itself a collection.
        // Flattens nested structures (lists wihtin lists) so that they can be processed as a single sequence of elements.
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Apple", "Banana"),
                Arrays.asList("Cherry", "Dates"),
                Arrays.asList("Elderberry", "Fig")
        );
        System.out.println(listOfLists.get(1).get(1));
        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());
    }
}
