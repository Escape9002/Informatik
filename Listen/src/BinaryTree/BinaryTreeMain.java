package BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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

    public static void main(String[] args) {
        int val = 1;
        int[] lol = createArr(0, 100, true);
        for(int g : lol) {
            System.out.print(g + " | ");     
        }
        System.out.println();
       
        int lSerResu = linearSearch(lol, val);
        
        boolean running = true;
        while(running) {
            
            if(lSerResu != 404) {
                running = false;
                System.out.println("Searched: " + val + " | found i: " + lSerResu + " | lol[i] :" + lol[lSerResu]);
            }else {
                System.out.println("looking for val: " + val);
                lSerResu = linearSearch(lol, val);
                val = val+1;
            }
            
//            try {
//                System.out.println("Searched: " + val + " | found i: " + lSerResu + " | lol[i] :" + lol[lSerResu]);
//                running = true;
//                }catch(ArrayIndexOutOfBoundsException e) {
//                    System.out.println("this number doesn't seem to be in this array...");
//                    running = false;
//                }
       }
       
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

    public static int linearSearch(int[] arr, int val) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == val) {
                return i;
            }
        }
        return 404;
    }

    public int linearSearch(List<Integer> list, int val) {
        int[] arr = new int[list.size() - 1];
        for (int i = 0; i < list.size() - 1; i++) {
            arr[i] = list.get(i);
        }

        return linearSearch(arr, val);
    }
}
