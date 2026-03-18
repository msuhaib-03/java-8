import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Function_Demo {
    public static void main(String[] args) {
        // A function is a functional interface that takes one argument and returns a value. It is used to apply a function to an object.
        // It has a single abstract method called apply() that takes an object of type T and returns an object of type R.
        // We can use lambda expressions to create instances of Function interface.

        // Example: Convert a string to uppercase
        Function<String, String> toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.apply("hello")); // Output: HELLO

        // Example: Get the length of a string
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("hello")); // Output: 5

        // Example: Square a number
        Function<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(5)); // Output: 25

        // Functions can also be composed using andThen() and compose() methods. For example, to convert a string to uppercase and then get its length:
        Function<String, Integer> toUpperCaseAndLength = toUpperCase.andThen(stringLength);
        System.out.println(toUpperCaseAndLength.apply("hello")); // Output: 5

        // Function has a default method called identity() that returns a function that always returns its input argument. For example:
        Function<Integer, Integer> value = Function.identity();
        System.out.println(value.apply(67)); // Output: 67

        // Things are made even simple by using UnaryOperator which is a special case of Function where the input and output types are the same. For example, to increment a number:
        UnaryOperator<Integer> increment = n -> n + 1;
        System.out.println(increment.apply(5)); // Output: 6
        // No need for type declaration and return type 2 times.
    }
}
