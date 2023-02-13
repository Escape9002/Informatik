package BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/*
1. Lineare Suche auf Liste und Array implementieren
2. Binäre Suche auf sortiertem Array implementieren.

Material dazu:    
    1. Die lineare Suche auf Array und Liste implementieren 
        - Erklärung inkl. Implementation auf einer Liste (Über die Übung + Lösung) http://u-helmich.de/inf/kursQ1/folge12/folge12-1.html 
        - Hier wird der im Video erklärt : Die lineare Suche | Algorithmen und Datenstrukturen.  
    2. Implementation auf einem Array:  3 Lineare Suche auf dem Array in Java 
        - Binäre Suche auf einem sortierten Array implementieren. 
        - Erklärung des Algorithmus' Die BINÄRE SUCHE (einfach erklärt) 
        - Implementierung: 4 Binaere Suche Laufzeitbergleich linear/binär: 6 Laufzeit- und allgemeiner Vergleich : Lineare und Binäre Suche 
*/

public class BinaryTreeMain {

    static Random rand = new Random();
    public static boolean runningThread = true;

    public static void main(String[] args) {
        int val = 55;

        System.out.println("----------------------------- Array -----------------------------");
        int[] arr = createArr(0, 100, false);
        for (int g : arr) {
            System.out.print(g + " | ");
        }
        System.out.println();

        System.out.println("----------------------------- List -----------------------------");
        List<Integer> list = createList(0,100,false);
        System.out.println(list);

        System.out.println("----------------------------- Array Linear Search -----------------------------");
        
        LinearSearch searchArray = new LinearSearch(arr);
        int lSerResu = searchArray.search(val);
        
        System.out.print("search: ");
        if(lSerResu == 404) {
            System.out.println("Int not found, triggered Random while creation?");
        }else {
        System.out.println("Searched: " + val + " | found i: " + lSerResu + " | lol[i] :" + arr[lSerResu]);
        }
        System.out.println("findAnyvalue: " + searchArray.findAnyValue(val));

        System.out.println("----------------------------- List Linear Search -----------------------------");
        
        LinearSearch searchList = new LinearSearch(list);
        lSerResu = searchList.search(val);
        
        System.out.print("search: ");
        if(lSerResu == 404) {
            System.out.println("Int not found, triggered Random while creation?");
        }else {
            System.out.println("Searched: " + val + " | found i: " + lSerResu + " | lol[i] :" + list.get(lSerResu));
        }

        System.out.println("findAnyvalue: " + searchList.findAnyValue(val));
        
        System.out.println("----------------------------- Array Binary Search -----------------------------");
        BinarySearch binSearch = new BinarySearch(arr);
        int bSerResu = binSearch.search(val);
        
        System.out.print("search: ");
        if(lSerResu == 404) {
            System.out.println("Int not found, triggered Random while creation?");
        }else {
        System.out.println("Searched: " + val + " | found i: " + bSerResu + " | lol[i] :" + arr[bSerResu]);
        }
        
        System.out.println("----------------------------- Benchmark -----------------------------");
        int iterations = 100000000;
        int arraySize = 100000000;
        int[] benArr = createArr(0, arraySize, false);
        
        String[] info = {"runtime (millis): ", "array size: ", "iterations: "};
        
        long[] benRes = benchmark(searchArray, benArr,iterations, "linearArr");
        System.out.print("linear (array)[ ");
        for(int i = 0; i < info.length; i++) {
            System.out.print(info[i] + benRes[i] + " | ");
        }
        System.out.println("]");
        
        
        benRes = benchmark(binSearch, benArr, iterations, "binarArray");
        System.out.print("binarry (array)[ ");
        for(int i = 0; i < info.length; i++) {
            System.out.print(info[i] + benRes[i] + " | ");
        }
        
        System.out.println("]");
    }
    
  
    public static long[] benchmark(SearchAlgorithms d, int[] arr, int iterations, String name) {
                
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
   

    public static int[] createArr(int min, int max, boolean random) {
        int[] arr = new int[(max - min)];
        if (random) {
            for (int i = 0; i < (max - min); i++) {
                arr[i] = rand.nextInt(max);
            }
        } else {
            for (int i = 0; i < (max - min); i++) {
                arr[i] = min + i;
            }
        }
        return arr;
    }

    public static List<Integer> createList(int min, int max, boolean random) {
        List<Integer> list = new LinkedList<Integer>();

        if (random) {
            for (int i = 0; i < (max - min); i++) {
                list.add(rand.nextInt(max));
            }

        } else {
            for (int i = 0; i < (max - min); i++) {
                list.add(i);
            }
        }
        
        return list;
    }

}
