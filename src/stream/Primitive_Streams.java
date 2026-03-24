package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Primitive_Streams {
    public static void main(String[] args) {
        // Primitive streams are specialized streams for handling primitive data types such as int, long, and double. They are designed to provide better performance and memory efficiency when working with large collections of primitive data. The three main types of primitive streams in Java are IntStream, LongStream, and DoubleStream.

        // Example: Using IntStream to generate a stream of integers
        IntStream intStream = IntStream.range(1, 10); // Generates a stream of integers from 1 to 9
        int sum = intStream.sum(); // Terminal operation to calculate the sum of the integers
        System.out.println("Sum of integers from 1 to 9: " + sum); // Output: Sum of integers from 1 to 9: 45

        int[] numbers = {7,4,1,8,0,2};
        IntStream stream = Arrays.stream(numbers);
        List<Integer> collect = IntStream.range(3, 44).boxed().collect(Collectors.toList());
        System.out.println("IntStream to List: " + collect); // Output: IntStream to List: [3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43]

        Stream.of(9,1,5,2);

        DoubleStream doubles = new Random().doubles(9);
        System.out.println(doubles.boxed().toList());
    }
}
