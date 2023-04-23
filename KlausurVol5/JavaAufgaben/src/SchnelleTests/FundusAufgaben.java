package SchnelleTests;
import java.util.LinkedList;
import java.util.Random;

public class JavaTester{

    
    public static void main(String args[]) {

        ///////////////////////////////////////////////////// Aufgabe A4 Filter Gerade

        LinkedList<Integer> e = new LinkedList<Integer>();
        for(int i = 0; i < 1000; i++){
            e.add(i);
        }
        
        System.out.println("FilterGerade: ");
        LinkedList<Integer> lol = filterGerade(e);

        //for(int g : lol){
        //    System.out.print(g + " | ");
        //}
        System.out.println("Done");

        //////////////////////////////////////////////////// Aufgabe B1.1 a)) BubbleSort

        Random rand = new Random();
        int size = 10000000;

        int[] randDaten = new int[size];
        for(int i = 0; i< size; i++){
            randDaten[i] = rand.nextInt(size);
        }

        int[] sortDaten = new int[size];
        for(int i = 0; i< size; i++){
            sortDaten[i] = i;
        }

        System.out.println("BubbleSort (sorted) ");
        int[] result = bubbleSort(sortDaten);
        //for(int g: result){
        //   System.out.print(g + " | ");
        //}
        System.out.println("Done");

        System.out.println("BubbleSort (random): ");
         result = bubbleSort(randDaten);
        //for(int g: result){
        //   System.out.print(g + " | ");
        //}
        System.out.println("Done");

    }

    static LinkedList<Integer> filterGerade(LinkedList<Integer> e){
        LinkedList<Integer> output = new LinkedList<Integer>();
        for(int g: e){
            if(g % 2 == 0){
                output.add(g);
            }
        }

        return output;
        
    }

    static int[] bubbleSort(int[] daten){
        for( int max = daten.length -1; max >0 ; max--){
            boolean swapped = false;
            for(int y = 0; y < daten.length-1; y++){
                if(daten[y] > daten[y +1]){
                    swapped = true;
                    int tmp = daten[y+1];
                    daten[y+1] = daten[y];
                    daten[y] = tmp;
                }
            }
            if(!swapped){
                return daten;
            }
        }
        return daten;
    }
}