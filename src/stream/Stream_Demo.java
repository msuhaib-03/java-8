package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Stream_Demo {
    public static void main(String[] args) {
        // A sequence of elements supporting various operations, supporting functions and declarative programming.
        // It is an interface and feature introduced in Java8.
        // It processes data in a functional and declarative way.
        // Simplify data processing: loops and conditional statements.
        // Improvements in performance: parallel processing and lazy evaluation.
        // Improvements in readibility: more concise and expressive code.
        // Enable functional programming: lambda expressions and method references.
        // Enable easy parallel processing: parallel streams and fork/join framework.
        // Easy parallelism without dealing with complexity of thread management and synchronization.


        // =========== HOW TO USE STREAM ===========
        // Source: Collection, Array, I/O channel, Generator function.
        // Intermediate operations: filter, map, sorted, distinct, limit, skip.
        // Terminal operations: forEach, collect, reduce, count, anyMatch, allMatch, noneMatch, findFirst, findAny.

        List<Integer> numbers = List.of(1,2,3,4,5);
        long count = numbers.stream().filter(x -> x % 2 == 0).count();
        System.out.println(count); // Output: 2

        // Filter takes predicate for condition holding
        // stream is unmodifiable data processing pipeline.

        // CREATING STREAMS //
        // 1) From Collections:
        List<Integer> list = Arrays.asList(4,6,1,8,2);
        Stream<Integer> stream = list.stream();

        // 2) From Arrays:
        String[] array = {"Apple", "Banana", "Cherry"};
        Stream<String> stream1 = Arrays.stream(array);

        // 3) Using Stream.of():
        Stream<String> stream2 = Stream.of("Apple", "Banana", "Cherry");

        // 4) Infinite Stream:
        Stream.generate(() -> Math.random()).limit(5).forEach(System.out::println);
        Stream.iterate(0, x -> x+1).limit(5).forEach(System.out::println);


    }
}
