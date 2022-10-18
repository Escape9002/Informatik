

public class KlausurVol3{
    public static void main(String[] args){
    	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Arrays (eindimensional und zweidimensional)    /////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// See Arrays.java 
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
        
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Sortieralgorithmen inkl Implementation von Bubblesort, SelectionSort.   ////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// See Sorting.java

        int[] array = {5,4,6,9,8,1,2,3,5,7,8,5,2,1,3,9,9};
        Sorting sorter = new Sorting(array);
        
        for(int g: sorter.bubblesort(array)) {
        	System.out.print(g + ",");
        }
        
        int[] array2 = {5,4,6,9,8,1,2,3,5,7,8,5,2,1,3,9,9};
        System.out.println();

        for(int g: sorter.selectionSort(array2)){
            System.out.print(g + ",");
        }
        
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


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	ADTs (einfach verkettete Liste, Schlange, Queue, Stack, binärer Baum, Set) beschreiben und Implementieren (gemäß unserer Übungsaufgaben)   /
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        
        
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Auswahl passender ADTs auf konkrete Anwendungsfälle (Rangierbahnhof, Familienbaum, ToDo-Liste, Klammerausdrücke).   ////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Inorder/Postorder/Preorder händisch darstellen. ////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	UML-Klassendiagramme mit Vererbung und Assoziation entwerfen und zur Modellierung nutzen.   ////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}