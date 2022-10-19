package KlausurVol3;

public class Sorting {
	int[] array;

	public Sorting(int[] array) {
		this.array = array;
	}
	
	public String ausgabe(int[] ar) {
		String msg = "";
		for(int g: ar) {
			msg = msg + g + " | ";
		}
		return msg ;
	}
	
	public int[] BubbleSort(int[] array) {

		boolean sotiert = false;
		int tmp;

		while (sotiert == false) {
			sotiert = true;
			for (int i = 0; i < (array.length - 1); i++) {
				if (array[i] > array[i + 1]) {
					tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
					sotiert = false;
				}
			}
		}

		return array;
	}
	/*
	public int[] SelectionSort(int[] array) {

		int tmpindex = 0;
		int tmpwert;

		for (int i = 0; i < (array.length - 1); i++) {

			for (int j = i; j < (array.length); j++) {
				tmpindex = i;
				if (array[tmpindex] > array[j]) {
					tmpindex = j;
				}
			}
			tmpwert = array[i];
			array[i] = array[tmpindex];
			array[tmpindex] = tmpwert;
		}

		return array;
	}
	*/

/////////////////////////////////////////////////////////////////////////
	/*
	 * Code from the lessons, more above this code
	 */
/*
	public int[] bubblesort(int[] array) {
		for (int i = 0; i < (array.length - 1); i++) {
			for (int y = 0; y < (array.length - 1); y++) {
				if (array[y] > array[(y + 1)]) {
					int n = array[y];
					array[y] = array[(y + 1)];
					array[y + 1] = n;
				}
			}
		}

		return array;
	}
*/
	public int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;// searching for lowest index
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}

		return array;

	}
	

}
