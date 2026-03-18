import java.util.function.Predicate;

public class Predicate_Demo {
    public static void main(String[] args) {
        // A predicate is a functional interface that takes one argument and returns a boolean value. It is used to test a condition on an object.
        // It has a single abstract method called test() that takes an object of type T and returns a boolean value.
        // We can use lambda expressions to create instances of Predicate interface.
        // It only holds a condition, storing a condition to variable which leads to variable programming.

        // Example: Check if a number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4)); // Output: true
        System.out.println("Is 5 even? " + isEven.test(5)); // Output: false

        // Example: Check if a string is empty
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("Is empty string empty? " + isEmpty.test("")); // Output: true
        System.out.println("Is 'Hello' empty? " + isEmpty.test("Hello")); // Output: false

        Predicate<String> alphabet = s -> s.startsWith("A");
        System.out.println("Does 'Apple' start with A? " + alphabet.test("Apple")); // Output: true
        System.out.println("Does 'Banana' start with A? " + alphabet.test("Banana")); // Output: false

        // And you can combine predicates using and(), or() and negate() methods. For example, to check if a number is even and greater than 10:
        Predicate<Integer> isGreaterThan10 = n -> n > 10;
        Predicate<Integer> isEvenAndGreaterThan10 = isEven.and(isGreaterThan10);
        System.out.println("Is 12 even and greater than 10? " + isEvenAndGreaterThan10.test(12)); // Output: true
        System.out.println("Is 8 even and greater than 10? " + isEvenAndGreaterThan10.test(8)); // Output: false
    }
}
