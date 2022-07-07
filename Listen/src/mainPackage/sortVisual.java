package mainPackage;

import java.awt.Canvas;
import java.util.Random;

import Window.Draw;
import Window.Window;

public class sortVisual {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static int[] array = new int[50]; // zu sortierendes Array

	public sortVisual() {

	}

	public static void main(String[] args) {

		Random r = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(0, 400);
			System.out.print(array[i] + " | ");
			// array[i] = i;
		}

		Draw Visual = new Draw();
		ausgabe(bubblelySort(array, Visual));

	}

	public static int[] selectionSort(int[] array) {
		long startTimer = System.nanoTime();

		int[] sort = array; // array wird in ein Arbeitsarray �berschrieben.

		int counter = 0; // Z�hler, der den Beginn des Sorierbereiches anzeigt.
		int number = 0; // Speicher f�r die "Selected" Zahl.
		int tmp = 0; // Hilfsvariable f�r Kopiervorgang

		for (int i = 0; i < sort.length - 1; i++) { // Schleife, die die Suchvorg�nge von Feld 0 bis zum letzten Feld
													// steuert. Schleife Endet, wenn letztes Feld als kleinste,
													// sortierende Zahl markiert.
			number = sort[i];

			for (int j = counter; j < sort.length - 1; j++) { // Schleife, die den Suchdurchgang f�r das jeweils erste
																// Arrayfeld steuert und damit alle Felder
																// durchklappert.
				if (number > sort[j + 1]) { // wenn Zahl im ersten Feld gr��er als Vergleichsfeld...
					tmp = sort[j + 1];
					sort[j + 1] = number;
					number = tmp;

				} // ...tausche die Werte
			}
			sort[counter] = number; // Schreibe gefundene kleinste Zahl in erstes Feld.
			counter++; // Erstes Feld ist hier sortiert, z�hle Anfangsbereich f�r n�chsten Durchgang um
						// 1 hoch.
		}

		System.out.println(System.nanoTime() - startTimer);
		return sort;
	}

	public static int[] bubblelySort(int[] array, Draw obj) {
		// long startTimer = System.nanoTime();

		int[] sort = array;

		for (int i = sort.length; i > 1; i--) {
			for (int y = 0; y < sort.length - 1; y++) {
				if (sort[y] > sort[y + 1]) {
					swap(sort, y, y + 1);
					Draw.draw(sort, 100, obj);
					// System.out.println(sort.length);
				}

			}
		}

		// System.out.println(System.nanoTime() - startTimer);

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

}
