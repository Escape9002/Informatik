package Bechmarking;

import BinaryTree.BinaryTreeMain;

public class BechmarkThread implements Runnable {
    long intervall;
    long timer;
    
    public BechmarkThread(long intervall) {
        timer = System.nanoTime();
        this.intervall = intervall;
    }

    @Override
    public void run() {
        while(Bechmark.runningThread) {
            //System.out.println((System.nanoTime() - timer));
            if((System.nanoTime() - timer) > intervall) {
                timer = System.nanoTime();
                System.out.println(Thread.currentThread().getName() + " is running ...");
            }
            
        }
            System.out.println(Thread.currentThread().getName() +" finished!");
        
    }
    
    
}