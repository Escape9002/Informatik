
public class SortAlgorithms {

	static int[] array = {4,5,9,1,5,90,8,4,5,3,-1}; // zu sortierendes Array
	
	public static void main(String[] args) {
		
		selectionSort(array);     // Ausgabe mir aufgerufen und das Ergebnis von Funktion "selectionSort" übergeben.
		
		System.out.println("                           ");
		
		
		bubblelySort(array);
		
		
	}
	
	public static int[] selectionSort(int[] array) {
		long startTimer = System.nanoTime();
		
		int[] sort = array;               // array wird in ein Arbeitsarray überschrieben.
		
		int counter=0;                    // Zähler, der den Beginn des Sorierbereiches anzeigt.
		int number=0;                     // Speicher für die "Selected" Zahl.
		int tmp=0;                        // Hilfsvariable für Kopiervorgang
		
		for(int i=0; i<sort.length-1;i++) {  // Schleife, die die Suchvorgänge von Feld 0 bis zum letzten Feld steuert. Schleife Endet, wenn letztes Feld als kleinste, sortierende Zahl markiert.     
			number=sort[i];
		
			for (int j=counter; j<sort.length-1;j++) { // Schleife, die den Suchdurchgang für das jeweils erste Arrayfeld steuert und damit alle Felder durchklappert.
				if(number>sort[j+1]) {    //wenn Zahl im ersten Feld größer als Vergleichsfeld...
					tmp=sort[j+1];
					sort[j+1]=number;
					number=tmp;}          //...tausche die Werte
				}
			sort[counter]=number;        // Schreibe gefundene kleinste Zahl in erstes Feld.
			counter++;                  // Erstes Feld ist hier sortiert, zähle Anfangsbereich für nächsten Durchgang um 1 hoch.
			}
		
		System.out.println(System.nanoTime() - startTimer);
		return sort;
	}
	
	public static int[] bubblelySort(int[] array) {
		long startTimer = System.nanoTime();
		
		
		int[] sort = array;
		for(int i = sort.length; i > 1; i--) {
			for(int y = 0; y < sort.length -1; y++) {
				if(sort[y] > sort[y+1]) {
					/*int n = sort[y];
					sort[y] = sort[y+1];
					sort[y+1] = n;
					*/
					swap(sort, y, y+1);
				}
			}
		}
		
		System.out.println(System.nanoTime()-startTimer);
		return sort;
	}
	
	public static int[] swap(int[] array, int i, int y  ) {
		int n = array[i];
		array[i] = array[y];
		array[y] = n;
		
		return array;
	}
	
	public static void ausgabe(int[] array) {
		for(int i=0;i<=array.length-1;i++) {
			System.out.println(array[i]+" ");
		}
		
	}
	

}	


