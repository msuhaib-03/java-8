public class Lambda_Expression {
    public static void main(String[] args) {
        // Lambda expression is an anonymous function with no name, no return type and no access modifier.
        // We had to write a lot of code to create a thread before Java 8, but with lambda expression we can create a thread in just one line of code.
        // Before Java 8
        Thread thread = new Thread(new Task());

        // All this code can be replaced with a lambda expression just like this: () -> {}
        // Your code goes into curly braces and round braces are for parameters if needed. In this case we don't have any parameters so we just leave it empty.
        // After Java 8
        Thread thread1 = new Thread(() -> {
            System.out.println("Task is running...");
        });

        // It is used to implement functional interfaces.
        // A functional interface is an interface in which there is only one abstract method.
        // An abstract method is a method that is declared without an implementation. It is meant to be overridden by subclasses.
        // Another example:

        MathOperation addOperation = (a, b) -> a + b;
        // It is a one-liner and there's no need for curly braces or return statement because the expression is simple and returns a value directly.
        MathOperation multiplyOperation = (a, b) -> a * b;
        System.out.println("Addition: " + addOperation.operate(5, 3)); // Output: 8
        System.out.println("Multiplication: " + multiplyOperation.operate(5, 3));

    }
}

interface  MathOperation {
    int operate(int a, int b);
}

class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Task is running...");
    }
}
