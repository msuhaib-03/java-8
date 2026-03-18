public class Lambda_Expression {
    public static void main(String[] args) {
        // Lambda expression is an anonymous function with no name, no return type and no access modifier.
        // We had to write a lot of code to create a thread before Java 8, but with lambda expression we can create a thread in just one line of code.
        // Before Java 8
        Thread thread = new Thread(new Task());

    }
}

class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Task is running...");
    }
}
