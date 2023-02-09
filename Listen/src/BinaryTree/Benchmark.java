package BinaryTree;

public class Benchmark extends Thread {
    long intervall;
    long timer;
    
    public Benchmark(long intervall) {
        timer = System.nanoTime();
        this.intervall = intervall;
    }
    
    public void start() {
        while(BinaryTreeMain.runningThread) {
        //System.out.println((System.nanoTime() - timer));
        if((System.nanoTime() - timer) > intervall) {
            timer = System.nanoTime();
            System.out.println("Running...");
        }
        
    }
        System.out.println("Finished");
    }
    
    
}
