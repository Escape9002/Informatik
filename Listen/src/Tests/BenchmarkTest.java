package Tests;

import java.util.concurrent.TimeUnit;

import BinaryTree.Benchmark;
import BinaryTree.BinarySearch;

public class BenchmarkTest {
    public static void main(String[] args) {
        Benchmark bench = new Benchmark(TimeUnit.MILLISECONDS.toNanos(250));
    }

}
