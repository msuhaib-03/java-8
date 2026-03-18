import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Demo {
    public static void main(String[] args) {
        // A consumer is a functional interface that takes one argument and returns no value. It is used to perform an action on an object.
        // It has a single abstract method called accept() that takes an object of type T and returns void.
        // We can use lambda expressions to create instances of Consumer interface.

        // Example: Print a string
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hello, World!"); // Output: Hello, World!

        // Example: Increment a number
        Consumer<Integer> increment = n -> System.out.println(n + 1);
        increment.accept(5); // Output: 6

        // Example: Add an element to a list
        List<String> list = new ArrayList<>();
        Consumer<String> addToList = s -> list.add(s);
        addToList.accept("Hello");
        addToList.accept("World");
        System.out.println(list); // Output: [Hello, World!]
    }
}
