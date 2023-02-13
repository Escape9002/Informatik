package benchmarking;

import java.util.List;
import java.util.concurrent.TimeUnit;

import BinaryTree.SearchAlgorithms;

public class Benchmark {

    public static boolean runningThread = false;
    
    static String[] info = { "runtime (millis): ", "array size: ", "iterations: " };
    
    public static void printResult(long[] res) {
        for (int i = 0; i < info.length; i++) {
            System.out.print(info[i] + res[i] + " | ");
        }
        System.out.println("]");
    }

    public static long[] benchmark(SearchAlgorithms d, int[] arr, int iterations, String name) {
        runningThread = true;
        // Benchmark runnable = new Benchmark(TimeUnit.MILLISECONDS.toNanos(250));
        Thread bench = new Thread(new BenchmarkThread(TimeUnit.MILLISECONDS.toNanos(250)));
        bench.setName(name);
        bench.start();
        // thread.run();

        long start = System.nanoTime();

        for (int i = iterations; i > 0; i--) {
            d.search(i);
        }
        runningThread = false;
        while (bench.isAlive()) {
            // wait for bench.thread to stop
        }
        long[] res = { TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start), arr.length, iterations };
        return res;

    }
    

    public static long[] benchmark(SearchAlgorithms d, List<Integer> list, int iterations, String name) {
        runningThread = true;
        // Benchmark runnable = new Benchmark(TimeUnit.MILLISECONDS.toNanos(250));
        Thread bench = new Thread(new BenchmarkThread(TimeUnit.MILLISECONDS.toNanos(250)));
        bench.setName(name);
        bench.start();
        // thread.run();

        long start = System.nanoTime();

        for (int i = iterations; i > 0; i--) {
            d.search(i);
        }
        runningThread = false;
        while (bench.isAlive()) {
            // wait for bench.thread to stop
        }
        long[] res = { TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start), list.size(), iterations };
        return res;

    }

}
