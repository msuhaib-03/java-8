package stream;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class Collectors_Utility {
    public static void main(String[] args) {
        // Collectors is a utility class that provides various methods to collect the elements of a stream into a collection or a map. It is used to perform various operations on the elements of a stream and return the result in a desired format. It is a part of the Stream API and it is used to perform various operations on the elements of a stream and return the result in a desired format.

        // 1) Collecting to a list
        List<String> names = Arrays.asList("Annie", "Bobby", "Chloe", "David");
        List<String> collect = names.stream().collect(Collectors.toList());
        System.out.println("Collecting to list: " + collect); // Output: [Annie, Bobby, Chloe, David]

        // 2) Collecting to a set
        // Removes duplication and doesn't maintain the order of elements.
        List<Integer> numbers = Arrays.asList(77,32,11,99,5,3,11,3,77);
        Set<Integer> collect1 = numbers.stream().collect(Collectors.toSet());
        System.out.println("Collecting to set: " + collect1);

        // 3) Collecting to a specific collection
        // It is used to collect the elements of a stream into a specific collection such as List
        ArrayDeque<String> collect2 = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println("Collecting to specific collection: " + collect2); // Output: [Annie, Bobby, Chloe, David]

        // 4) Joining Strings
        // It is used to join the elements of a stream into a single string with a specified delimiter, prefix and suffix.
        // Concatenates stream elements into a single stream.
        String collect3 = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println("Joining Strings: " + collect3); // Output: ANNIE, BOBBY, CHLOE, DAVID

        // 5) Summarizing Data
        // It is used to summarize the elements of a stream using various statistical operations such as counting the number of elements, calculating the sum, average, minimum and maximum of the elements.
        IntSummaryStatistics collect4 = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Summarizing Data: " + collect4); // Output: IntSummaryStatistics{count=9, sum=337, min=3, average=37.44444444444444, max=99}

        // 6) Grouping Elements
        // It is used to group the elements of a stream based on a specified classifier function and return the result in a map where the keys are the result of applying the classifier function and the values are lists of elements that belong to each group.
        List<String> elements = Arrays.asList("Hello", "java", "collections", "framework", "lambda", "streams");
        Map<Integer, List<String>> collect5 = elements.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println("Grouping Elements: " + collect5); // Output: {5=[Hello, java], 11=[collections, framework], 6=[lambda, streams]}

        Map<Integer, Long> collect6 = elements.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.counting()));// this will count the number of elements in each group and return the result in a map where the keys are the result of applying the classifier function and the values are the count of elements that belong to each group.
        System.out.println("Grouping Elements with counting: " + collect6); // Output: {5=2, 11=2, 6=2}

        // 7) Partitioning Elements
        // It is used to partition the elements of a stream based on a specified predicate and return the result in a map where the keys are the result of applying the predicate and the values are lists of elements that belong to each partition.
        // Partition elements into 2 groups based on a predicate (true/false).
        System.out.println("Partitioning Elements: ");
        elements.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)).forEach((k,v) -> System.out.println(k + " : " + v)); // Output: false : [Hello, java] true : [collections, framework, lambda, streams]

        // 8) Mapping and Collecting
        // It is used to perform a mapping operation on the elements of a stream and then collect the result into a collection or a map. It is a combination of the map() and collect() methods and it is used to perform a mapping operation on the elements of a stream and then collect the result into a collection or a map.
        // Applies mapping before collecting
        List<String> collect7 = elements.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList()));
        System.out.println("Mapping and Collecting: " + collect7); // Output: [HELLO, JAVA, COLLECTIONS, FRAMEWORK, LAMBDA, STREAMS]

        // 9) toMap
        // Direct key-value mapping of stream elements into a map. It is used to collect the elements of a stream into a map where the keys are the result of applying a specified key mapper function and the values are the result of applying a specified value mapper function.
        List<String> fruits = Arrays.asList("cherry", "guava", "grapes", "melon", "cherry", "guava");
        Map<String, Integer> collect8 = fruits.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y));
        System.out.println("toMap: " + collect8); // output changes if the elements are duplicated and come again because in map, there's key-value pairs and they have to be unique, so if it comes next time the key, it adds up to the value of them.


    }
}
