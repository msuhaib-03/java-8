package stream;

import java.util.List;
import java.util.stream.Stream;

public class Parallel_Stream {
    static long factorial(int n){
       long result = 1;
       for (int i = 1; i <= 10000; i++) {
           result *= i;
       }
       return result;
   }

    public static void main(String[] args) {
        // Type of stream that enables parallel processing of elements. Allowing multiple threads to process parts of stream simultaneously.
        // This improves performance for significantly large datasets.
        // Workload distributes across multiple threads.

        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x+1).limit(20000).toList();
        List<Long> factorialList = list.stream().map(Parallel_Stream::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken in Sequential Stream: " + (endTime - startTime) + " ms");

        // THE ABOVE CODE WAS FOR SEQUENTIAL STREAM, NOW LET'S SEE THE SAME CODE WITH PARALLEL STREAM.
        startTime = System.currentTimeMillis();
        list = Stream.iterate(1, x -> x+1).limit(20000).toList();
        factorialList = list.parallelStream().map(Parallel_Stream::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken in Parallel Stream: " + (endTime - startTime) + " ms");

        // Parallel Streams are the most effective for CPU-intensive tasks or large datasets where tasks are independent.
        // They may add overhead for simple tasks or small datasets, so it's important to consider the nature of the task and dataset size when deciding to use parallel streams.


    }
}
