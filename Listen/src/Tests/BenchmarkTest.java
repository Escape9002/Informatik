package Tests;

import java.util.concurrent.TimeUnit;

import BinaryTree.LinearSearch;
import benchmarking.Benchmark;
import benchmarking.BenchmarkThread;


public class BenchmarkTest {
    
    public static void main(String[] args) {
        int[] arr = new int[50];
        for(int i = 0; i < 50; i++) {
            arr[i] = i;
        }
        
        LinearSearch lol = new LinearSearch(arr);
        Benchmark.benchmark(lol, arr, 500, "lol");
    }

}
