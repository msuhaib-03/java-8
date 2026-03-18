import java.util.List;

public class Method_Reference {
    public static void main(String[] args) {
        // It uses method without invoking it and inplace of lambda expression, we can use method reference to refer to a method without invoking it. It is a shorthand notation of lambda expression and it makes the code more readable and concise.
        // It is used to refer to a method of a class or an instance without invoking it. It is a functional interface that takes a method as an argument and returns a reference to that method. It is used to refer to a method of a class or an instance without invoking it.

        // Method as parameter replacing lambda.
        List<String> list = List.of("Sobi", "Amjad", "Rabiya");
        // Using lambda expression:
        list.forEach(x -> System.out.println(x));

        // Using method reference:
        list.forEach(System.out::println);
        // It is basically a shorthand notation of lambda expression and it makes the code more readable and concise. It is used to refer to a method of a class or an instance without invoking it.

    }
}
