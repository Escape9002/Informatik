package BinaryTree;

public class Benchmark implements Runnable {
    long intervall;
    long timer;
    
    public Benchmark(long intervall) {
        timer = System.nanoTime();
        this.intervall = intervall;
    }

    @Override
    public void run() {
        while(BinaryTreeMain.runningThread) {
            //System.out.println((System.nanoTime() - timer));
            if((System.nanoTime() - timer) > intervall) {
                timer = System.nanoTime();
                System.out.println(Thread.currentThread().getName() + " is running ...");
            }
            
        }
            System.out.println(Thread.currentThread().getName() +" finished!");
        
    }
    
    
}
