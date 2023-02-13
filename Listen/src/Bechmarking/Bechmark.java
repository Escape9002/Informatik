package Bechmarking;

import java.util.concurrent.TimeUnit;

import BinaryTree.Benchmark;
import BinaryTree.SearchAlgorithms;

public class Bechmark {
    
    public static boolean runningThread = false;

    public static long[] benchmark(SearchAlgorithms d, int[] arr, int iterations, String name) {
        runningThread = true;
        //Benchmark runnable = new Benchmark(TimeUnit.MILLISECONDS.toNanos(250));
        Thread bench = new Thread(new Benchmark(TimeUnit.MILLISECONDS.toNanos(250)));
        bench.setName(name);
        bench.start();
        //thread.run();
   
   long start = System.nanoTime();
   
   for(int i = iterations; i > 0; i--) {
       d.search(i);
   }
   runningThread = false;
   while(bench.isAlive()) {
       // wait for bench.thread to stop
   }
   long[] res = {TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start), arr.length,  iterations};
   return res;
   
}

    
}
