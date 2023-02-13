package benchmarking;

import BinaryTree.BinaryTreeMain;

public class BenchmarkThread implements Runnable {
    long intervall;
    long timer;
    
    public BenchmarkThread(long intervall) {
        timer = System.nanoTime();
        this.intervall = intervall;
    }

    @Override
    public void run() {
        while(Benchmark.runningThread) {
            //System.out.println((System.nanoTime() - timer));
            if((System.nanoTime() - timer) > intervall) {
                timer = System.nanoTime();
                System.out.println(Thread.currentThread().getName() + " is running ...");
            }
            
        }
            System.out.println(Thread.currentThread().getName() +" finished!");
        
    }
    
    
}