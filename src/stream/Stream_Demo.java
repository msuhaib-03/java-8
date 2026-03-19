package stream;

import java.util.List;

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
    }
}
