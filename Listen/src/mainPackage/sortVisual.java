package mainPackage;

import java.util.Random;

import Window.Draw;

public class sortVisual {

	static int[] array = new int[500]; // zu sortierendes Array
	static int max = 400;
	static int speed = 0;
	
	public sortVisual() {

	}
	

	
	public static void main(String[] args) {

		// array = formArray(array, 0,400,true);
		array = formArray(array,max,true);
		Draw Visual = new Draw(speed);
		ausgabe(bubblelySort(array, Visual));
		
		array = formArray(array, max,true);
		// array = formArray(array, 0,400,true);
		
		ausgabe(selectionSort(array, Visual));
	

	}

	public static int[] selectionSort(int[] array, Draw obj) {
		long startTimer = System.nanoTime();
		int draws = 0;
		
		int[] sort = array; // array wird in ein Arbeitsarray überschrieben.

		int counter = 0; // Zähler, der den Beginn des Sorierbereiches anzeigt.
		int number = 0; // Speicher für die "Selected" Zahl.
		int tmp = 0; // Hilfsvariable für Kopiervorgang

		for (int i = 0; i < sort.length - 1; i++) { // Schleife, die die Suchvorgänge von Feld 0 bis zum letzten Feld
													// steuert. Schleife Endet, wenn letztes Feld als kleinste,
													// sortierende Zahl markiert.
			number = sort[i];

			for (int j = counter; j < sort.length - 1; j++) { // Schleife, die den Suchdurchgang für das jeweils erste
																// Arrayfeld steuert und damit alle Felder
																// durchklappert.
				if (number > sort[j + 1]) { // wenn Zahl im ersten Feld größer als Vergleichsfeld...
					tmp = sort[j + 1];
					sort[j + 1] = number;
					number = tmp;
					
					

				} // ...tausche die Werte
				Draw.drawLine(sort,j,  obj);
				draws++;
			}
			sort[counter] = number; // Schreibe gefundene kleinste Zahl in erstes Feld.
			counter++; // Erstes Feld ist hier sortiert, zähle Anfangsbereich für nächsten Durchgang um
						// 1 hoch.
		}

		System.out.println("RunTime: " + ((System.nanoTime() - startTimer) - speed*draws));
		return sort;
	}

	public static int[] bubblelySort(int[] array,Draw g) {
		long startTimer = System.nanoTime();
		int count = 0;

		int[] sort = array;

		for (int i = sort.length; i > 1; i--) {
			for (int y = 0; y < sort.length - 1; y++) {
				if (sort[y] > sort[y + 1]) {
					swap(sort, y, y + 1);
					Draw.drawLine(sort,y,max,  g);
					count++;
				}

			}
		}

		System.out.println("RunTime: " + ((System.nanoTime() - startTimer) - speed*count));
		//Draw.consoleDraw(sort, 100);
		return sort;

	}
	
	

	public static int[] swap(int[] array, int i, int y) {
		int n = array[i];
		array[i] = array[y];
		array[y] = n;

		return array;
	}

	public static void ausgabe(int[] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i] + " ");
		}

	}
	
	public static int[] formArray(int[] array, int min, int max, boolean debug) {
		
		Random r = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(min, max);
			if(debug) System.out.print(array[i] + " | ");
		}
		if(debug) System.out.println();
		
		return array;
		
	}
	
public static int[] formArray(int[] array,  int max, boolean debug) {
		
		Random r = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt( max);
			if(debug) System.out.print(array[i] + " | ");
		}
		if(debug) System.out.println();
		
		return array;
		
	}

}
