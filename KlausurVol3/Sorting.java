public class Sorting {
	int[] array;

	public Sorting(int[] array) {
		this.array = array;
	}

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

	public int[] selectionSort(int[] array) {
		int counter = 0;
		int number = 0;
		int tmp = 0;
		
		for(int i = 0; i < array.length -1; i++) {
			number = array[i];
			
			for(int j = counter; j<array.length-1; j++) {
				if(number > array[j+1]) {
					tmp = array[j+1];
					array[j+1] = number;
					number = tmp;
				}
			}
			array[counter] = number;
			counter++;
		}

		return array;

	}

}