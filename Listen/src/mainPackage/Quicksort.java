package mainPackage;

public class Quicksort {
	
//	public Quicksort(int[] array, final int erstes, final int letztes) {
//		quicksort(array, erstes, letztes);
//	}

	private int teilung(int[] array, final int erstes, final int letztes) {

		int pivot = array[((erstes + letztes) / 2)];
		int posL = erstes;
		int posR = letztes;

		while (posL <= posR) {
			while (array[posL] < pivot) {
				posL++;
			}

			while (array[posR] > pivot) {
				posR--;
			}

			if (posL <= posR) {

				//swap(array, posR, posL);

				int tmp = array[posL];
				array[posL] = array[posR];
				array[posR] = tmp;

				// muss ins if
				posR--;
				posL++;

			}
		}

		return posL;
	}

	public void quicksort(int[] array, final int ersters, final int letztes) {
		//int[] sort = array;
		
		int index = teilung(array, ersters, letztes);
		//System.out.println(index);
		
		if(ersters < index -1) {
			quicksort(array, ersters,letztes-1);
		}
		
		if(index < letztes) {
			quicksort(array, index, letztes);
		}
		
	}
	
	private int[] swap(int[] array, int i, int y) {
		int n = array[i];
		array[i] = array[y];
		array[y] = n;

		return array;
	}
	
}
