package KlausurVol3;

import java.util.Queue;
import java.util.Random;

import BinaryTree.Bintree;
import LinkedList.LinkedList;
import LinkedList.QueueWithList;
import LinkedList.StackWithList;

public class KlausurVol3{

    static Random rand = new Random();
    public static void main(String[] args){
    	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Arrays (eindimensional und zweidimensional)    /////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // See Arrays.java 
        System.out.println("\n//	Arrays (eindimensional und zweidimensional)    /////////////////////////////////////////////////////////////////////////////////////////////\n");
        Arrays ownArray = new Arrays();

        ownArray.arrayInt(5);
        ownArray.arrayInt(55);
        System.out.println("arrayInt: " + ownArray.findArrayInt(5));
        System.out.println("arrayInt: " + ownArray.findArrayInt(54));

        ownArray.hashedArray(100);
        ownArray.hashedArray(295);
        System.out.println("hashedArray: " + ownArray.findHashedArray(100));
        System.out.println("hashedArray: " + ownArray.findHashedArray(294));

        for (int i = 0; i <= 100; i++){
            ownArray.arrayInt(i);
        }
        
        System.out.println("arrayInt: " + ownArray.findArrayInt(100));

        for(int i = 0; i<= 100; i++){
            ownArray.hashedArray(i);
        }
        System.out.println("hashedArray: " + ownArray.findHashedArray(100));

        System.out.println("intArray(bench): " + ownArray.benchmarkInt(100));
        System.out.println("hashedArray(bench): " + ownArray.benchmarkH(100));
        
        //	FOLLOWING STRING IMPLEMENTATION-----------------------------------
        
        ownArray.arrayStr("Hello World");
        ownArray.arrayStr("Oh no");
        System.out.println("arrayStr: " + ownArray.findArrayStr("Hello World"));
        System.out.println("arrayStr: " + ownArray.findArrayStr("OHHHNO"));

        ownArray.hashedArrayStr("Hello World");
        ownArray.hashedArrayStr("Oh no");
        System.out.println("hashedArrayStr: " + ownArray.findHashedArrayStr("Hello World"));
        //System.out.println("hashedArrayStr: " + ownArray.findHashedArrayStr("OHHNO")); // this doesn't work, dont know why....

        for (int i = 0; i <= 100000; i++){
            ownArray.arrayStr(Integer.toString(i));
        }
        
        System.out.println("arrayStr: " + ownArray.findArrayStr("100"));

        for(int i = 0; i<= 100000; i++){
            ownArray.hashedArrayStr(Integer.toString(i));
        }
        System.out.println("hashedArrayStr: " + ownArray.findHashedArrayStr("100"));

        System.out.println("StrArray(bench): " + ownArray.benchmarkStr("100"));
        System.out.println("StrhashedArray(bench): " + ownArray.benchmarkHStr("100"));
        
        //	TEST---------------------------------------------------------------
        System.out.println("print 2d Array: " + ownArray.test());
        System.out.println("print missing between 0-9: "+ ownArray.missing());
        
        
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Sortieralgorithmen inkl Implementation von Bubblesort, SelectionSort.   ////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// See Sorting.java
System.out.println("\n//	Sortieralgorithmen inkl Implementation von Bubblesort, SelectionSort.   ////////////////////////////////////////////////////////////////////\n");

        int[] array = formArray(10);
        Sorting sorter = new Sorting(array);
        System.out.println("BubbleSort: " + sorter.ausgabe(sorter.BubbleSort(array)));

        array = formArray(10);
        System.out.println("SelectionSort: " + sorter.ausgabe(sorter.selectionSort(array)));
               
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	MergeSort/QuickSort beschreiben.    ////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
         * MergeSort: --> Devide and Conquer 
         * Die Liste wird an so lange in kleinere Listen geteilt, bis nur noch 1 Wert darin steht. Die Werte zweier Listen werden
         * verglichen und in der Reihenfolge zusammengefügt. Dies passiert für alle Listenteile.
         * 
         * 		1,5,3,8
         * 		1,5	| 3,8
         * 		1 | 5 | 3 | 8
         * 		1,5 | 3,8
         * 		1,3,5,8
         *
         * 
         * QuickSort: --> devid(ieren)e and concque(st of paradise)r
         * #define Pivotelement allgemein: ein Punkt an dem ihr etwas unterteilt; hier: alle Elemente möglich (erstes, letztes, median, random, idc)
         * #define PivotelementBSP das erste Element
         * 
         * Es wird an dem Pivotelement sortiert (kleiner nach Links, größer nach rechts);
         * Vorgang wiederholen bis Pivotelement == letzes Element aka Pivotelement hat keine vergleichswerte mehr
         * 
         */
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Sortierverfahren hinsichtlich der Laufzeit, Speicherbedarf und Stabilität (letzteres erläutere ich in kommender Stunde) bewerten.   ////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        /*
         * #define Stabil das Verhalten der Laufzeit im Verhaeltnis zur "vorsortierung" des Array; Achtung, das ist nicht die WIKI-Def
         * 
         * Bubblesort: 
         * 	instabil, wenn niedrigster Wert ganz hinten im Array (pro Takt nur ein Schritt nach vorne für die Zahl) vs vorsortiert (ein Durchlauf)
         * 
         * Selection Sort:
         * 	instabil groestes element am anfang --> worst case wie bubblesort
         * 
         * Mergesort:
         * 	mehr oder weniger Stabil, sortierte Teillisten werden schneller zusammengefuegt als unsortierte, macht aber keinen grosen Unterschied(?)
         * 
         * Quicksort:
         * 	instabil
         */

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	ADTs (einfach verkettete Liste, Schlange, Queue, Stack, binärer Baum, Set) beschreiben und Implementieren (gemäß unserer Übungsaufgaben)   /
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
System.out.println("\n//	ADTs (einfach verkettete Liste, Schlange, Queue, Stack, binärer Baum, Set) beschreiben und Implementieren (gemäß unserer Übungsaufgaben)   /\n");
        //  EINFACHE LISTE  ------------------------------------------------------------------
        System.out.println("\n//  EINFACHE LISTE  ------------------------------------------------------------------\n");
        LinkedList list = new LinkedList(100); 
        list.add(1);
        list.add(55);
        list.add(9);
        System.out.println("liste all: " + list.toString());

        list.remove();
       
        System.out.println("liste all: " + list.toString());

        //  Queue  --------------------------------------------------------------------------
        System.out.println("\n//  Queue  --------------------------------------------------------------------------\n");

        QueueWithList queue = new QueueWithList(0);
        for(int i = 0; i < 25; i++){
            queue.enqueue(i);
            System.out.println("Queue: " + queue.toString());
        }

        for(int i = 0; i < 25; i++){
            queue.dequeue();
            System.out.println("Queue: " + queue.toString());
        }
        System.out.println("Queue: " + queue.toString());
        
       
        //  Stack  --------------------------------------------------------------------------
        System.out.println("\n//  Stack  --------------------------------------------------------------------------\n");

        StackWithList stack = new StackWithList(0);
        for(int i = 0; i < 25; i++){
            stack.push(i);
            System.out.println(stack.toString());
        }

        for(int i = 0; i< 25; i++){
            stack.pop();
            System.out.println(stack.toString());
        }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Auswahl passender ADTs auf konkrete Anwendungsfälle (Rangierbahnhof, Familienbaum, ToDo-Liste, Klammerausdrücke).   ////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

System.out.println("\n//	Auswahl passender ADTs auf konkrete Anwendungsfälle (Rangierbahnhof, Familienbaum, ToDo-Liste, Klammerausdrücke).   ////////////////////////\n");

        Bintree tree = new Bintree(100);
        tree.insert(45);
        tree.insert(75);
        tree.insert(101);
        tree.insert(125);
        tree.insert(150);

        System.out.println("PreOrder (WLR): "+tree.preOrder());
        System.out.println("inOrder (LWR): "+tree.inOrder());
        System.out.println("postOrder (LRW): "+tree.postOrder());

        // notice: ( PreO; InO; PosO; --> pip | und das W rutscht durch LR durch )|| (oder zeitformen beachten pre in post....)
        // p: WLR
        // i: LWR
        // p: LRW

        /*
         * Anwendungsfälle:
         *  Rangierbahnhof: first zug in first zug out --> fifo --> queue
         *  Familienbaum: 1 parent + 2 childs --> binary Tree                       (oder???)
         *  ToDo-Liste: Queue oder Stack; Last in First out --> lifo --> stack
         *  Klammerausdrücke: what even are these | PS: kommt nicht dran....
         */
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Inorder/Postorder/Preorder händisch darstellen. ////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
         * 
         */
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	UML-Klassendiagramme mit Vererbung und Assoziation entwerfen und zur Modellierung nutzen.   ////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
         * 
         */

    }

//  OWN STUFF------------------------------------------------
    public static int[] formArray(int size){
        int[] ar = new int[size];
        for(int i = 0; i < size; i++){
            ar[i] = rand.nextInt(100);
        }

        return ar;
    }
}