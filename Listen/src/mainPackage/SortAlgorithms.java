package mainPackage;

import java.util.Arrays;
import java.util.Random;

public class SortAlgorithms {

	static int values = 1000000;
	static int max = values;
	
	public static void main(String[] args) {
		int[] numbers = new int[values];
		
		long startTimer = System.nanoTime();
		formArray(numbers,max,false);
		System.out.println("formArray: "+(double)(System.nanoTime() - startTimer)/1000000000);
		
		int[] array = numbers;
		
		
		selectionSort(array);
		System.out.println("selection: " +(double)(System.nanoTime() - startTimer)/1000000000);
		//ausgabe(array);
		
		array = numbers;
		startTimer = System.nanoTime();
		bubblelySort(array);
		System.out.println("bubble: " +(double)(System.nanoTime() - startTimer)/1000000000);
		//ausgabe(array);

		array = numbers;
		QuickSort qieeek = new QuickSort();
		startTimer = System.nanoTime();
		qieeek.quicksort(numbers, 0, numbers.length-1);
		System.out.println("qick: " +(double)(System.nanoTime() - startTimer)/1000000000);
		//ausgabe(array);
		
		array = numbers;
		MergeSort mergues = new MergeSort();
		startTimer = System.nanoTime();
		mergues.mergeSort(numbers);
		System.out.println("merge: " +(double)(System.nanoTime() - startTimer)/1000000000);
		//ausgabe(array);
		
	}
	
	// Java --version < 8
		public static int[] formArray(int[] array, int max, boolean debug) {

			Random r = new Random();

			for (int i = 0; i < array.length; i++) {
				array[i] = r.nextInt(max);
				if (debug)
					System.out.print(array[i] + " | ");
			}
			if (debug)
				System.out.println();

			return array;

		}

	public static int[] selectionSort(int[] array) {

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
			}
			sort[counter] = number; // Schreibe gefundene kleinste Zahl in erstes Feld.
			counter++; // Erstes Feld ist hier sortiert, zähle Anfangsbereich für nächsten Durchgang um
						// 1 hoch.
		}

	
		return sort;
	}

	public static int[] bubblelySort(int[] array) {
		int[] sort = array;
		for (int i = sort.length; i > 1; i--) {
			for (int y = 0; y < sort.length - 1; y++) {
				if (sort[y] > sort[y + 1]) {
					/*
					 * int n = sort[y]; sort[y] = sort[y+1]; sort[y+1] = n;
					 */
					swap(sort, y, y + 1);
				}
			}
		}

		return sort;
	}

	private static int[] swap(int[] array, int i, int y) {
		int n = array[i];
		array[i] = array[y];
		array[y] = n;

		return array;
	}

	public static void ausgabe(int[] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.print(array[i] + "|");
		}
		System.out.println();

	}

}
