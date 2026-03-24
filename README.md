# Java 8 - Lambda Expressions & Streams

## Overview
Java 8 introduced **Lambda Expressions** and the **Stream API**, enabling developers to write cleaner, more concise, and functional-style code.  
These features simplify operations on collections, improve readability, and support parallel processing.

---

## Lambda Expressions
A **Lambda Expression** is a short block of code that takes parameters and returns a value.  
It enables functional programming in Java by allowing you to pass behavior as a method argument.

### Syntax
(parameters) -> expression
(parameters) -> { statements; }

// Without Lambda
Runnable r1 = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello from Runnable!");
    }
};

// With Lambda
Runnable r2 = () -> System.out.println("Hello from Lambda!");



## Stream API
The Stream API processes collections of data in a declarative way (similar to SQL).
It supports operations like filtering, mapping, sorting, and reducing.

Key Features
Functional: Focus on what to do, not how to do it.
Lazy Evaluation: Operations are executed only when needed.
Parallel Processing: Easily switch to parallel streams for performance

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Filter names starting with 'A' and print them
        names.stream()
             .filter(name -> name.startsWith("A"))
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
