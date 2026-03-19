package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lazy_Evaluation {
    public static void main(String[] args) {
        // Lazy evaluation is a technique in which the evaluation of an expression is delayed until its value is actually needed. It is used to improve the performance of a program by avoiding unnecessary computations. In Java, lazy evaluation is implemented using the Stream API, which allows us to create a stream of data and perform operations on it without actually executing those operations until a terminal operation is invoked.
        // Just to show that filter doesn't print anything until terminal operation is applied and the statements other than this will run first and then stream filter.

        // Example: Lazy evaluation in Stream API
        List<String> names = List.of("Azlan", "Usama", "Usman", "Habibi");
        Stream<String> stringStream = names.stream().filter(name -> {
            System.out.println("Filtering: " + name);
            return name.length() > 5;
        });

        System.out.println("Before terminal operation");

        // Now the filter will execute and print the statements because we have applied terminal operation on it.
        List<String> result = stringStream.toList();
            System.out.println("After terminal operation");
            System.out.println(result); // Output: [Azlan, Usama, Usman, Habibi]

    }
}
