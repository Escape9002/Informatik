package BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import benchmarking.Benchmark;

/*
1. Lineare Suche auf Liste und Array implementieren
2. Bin�re Suche auf sortiertem Array implementieren.

Material dazu:    
    1. Die lineare Suche auf Array und Liste implementieren 
        - Erkl�rung inkl. Implementation auf einer Liste (�ber die �bung + L�sung) http://u-helmich.de/inf/kursQ1/folge12/folge12-1.html 
        - Hier wird der im Video erkl�rt : Die lineare Suche | Algorithmen und Datenstrukturen.  
    2. Implementation auf einem Array:  3 Lineare Suche auf dem Array in Java 
        - Bin�re Suche auf einem sortierten Array implementieren. 
        - Erkl�rung des Algorithmus' Die BIN�RE SUCHE (einfach erkl�rt) 
        - Implementierung: 4 Binaere Suche Laufzeitbergleich linear/bin�r: 6 Laufzeit- und allgemeiner Vergleich : Lineare und Bin�re Suche 
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
        List<Integer> list = createList(0, 100, false);
        System.out.println(list);

        System.out.println("----------------------------- Array Linear Search -----------------------------");

        LinearSearch searchArray = new LinearSearch(arr);
        int lSerResu = searchArray.search(val);

        System.out.print("search: ");
        if (lSerResu == 404) {
            System.out.println("Int not found, triggered Random while creation?");
        } else {
            System.out.println("Searched: " + val + " | found i: " + lSerResu + " | lol[i] :" + arr[lSerResu]);
        }
        System.out.println("findAnyvalue: " + searchArray.findAnyValue(val));

        System.out.println("----------------------------- List Linear Search -----------------------------");

        LinearSearch searchList = new LinearSearch(list);
        lSerResu = searchList.search(val);

        System.out.print("search: ");
        if (lSerResu == 404) {
            System.out.println("Int not found, triggered Random while creation?");
        } else {
            System.out.println("Searched: " + val + " | found i: " + lSerResu + " | lol[i] :" + list.get(lSerResu));
        }

        System.out.println("findAnyvalue: " + searchList.findAnyValue(val));

        System.out.println("----------------------------- Array Binary Search -----------------------------");
        BinarySearch binSearch = new BinarySearch(arr);
        int bSerResu = binSearch.search(val);

        System.out.print("search: ");
        if (lSerResu == 404) {
            System.out.println("Int not found, triggered Random while creation?");
        } else {
            System.out.println("Searched: " + val + " | found i: " + bSerResu + " | lol[i] :" + arr[bSerResu]);
        }

        System.out.println("----------------------------- Benchmark -----------------------------");
        /*
         * java -XX:+PrintFlagsFinal -version | findstr /i
         * "HeapSize PermSize ThreadStackSize"
         * size_t HeapSizePerGCThread = 43620760
         * size_t MaxHeapSize = 4284481536
         * size_t LargePageHeapSizeThreshold = 134217728
         */

        int iterations = 100000000;
        int arraySize = 43620760;
        int[] benArr = createArr(0, arraySize, false);
        List<Integer> benList = createList(0, arraySize, false);

        long[] benResLinearArr = benchmarking.Benchmark.benchmark(searchArray, benArr, iterations, "linearArr");
        Benchmark.printResult(benResLinearArr);

        long[] benResLinearList = benchmarking.Benchmark.benchmark(searchList, benList, iterations, "linearList");
        Benchmark.printResult(benResLinearList);

        long[] benResbinarArr = benchmarking.Benchmark.benchmark(binSearch, benArr, iterations, "binarArray");
        Benchmark.printResult(benResbinarArr);
        
        System.out.println("----------- RESULTS ----------------");
        Benchmark.printResult(benResLinearArr);
        Benchmark.printResult(benResLinearList);
        Benchmark.printResult(benResbinarArr);
        
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
        if ((max - min) > 43620760) {
            System.out.println("Size problems may occur...");
        }
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