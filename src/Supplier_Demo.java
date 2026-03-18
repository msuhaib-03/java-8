import java.util.function.Supplier;

public class Supplier_Demo {
    public static void main(String[] args) {
        // It has only 1 method: get() and no default & no static methods. It is used to generate or supply values without taking any input. It is a functional interface that takes no arguments and returns a value of type T.
        // We can use lambda expressions to create instances of Supplier interface.

        Supplier<String> stringSupplier = () -> "Hey! I'm Supplier.";
        System.out.println(stringSupplier.get());

    }
}
