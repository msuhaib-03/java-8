import java.util.List;
import java.util.stream.Collectors;

public class Constructor_Reference {
    public static void main(String[] args) {
        // It is a shorthand notation of lambda expression and it makes the code more readable and concise. It is used to refer to a constructor of a class without invoking it. It is a functional interface that takes a constructor as an argument and returns a reference to that constructor. It is used to refer to a constructor of a class without invoking it.

        // Example: Using constructor reference to create an instance of a class
        List<String> names = List.of("Apple", "Samsung", "Blackberry");

        // We are using constructor reference to create an instance of MobilePhone class for each name in the list. The constructor reference is used to refer to the constructor of the MobilePhone class without invoking it. It is a shorthand notation of lambda expression and it makes the code more readable and concise. It is used to refer to a constructor of a class without invoking it.
        List<MobilePhone> phones = names.stream().map(MobilePhone::new).collect(Collectors.toList());
        System.out.println(phones);

    }
}

class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}