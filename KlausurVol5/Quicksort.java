public class Quicksort {
    Quicksort(){}

    int pivotSearch(int[] arr, int low, int high){
        int pivot = arr[high];
        int x = -1;
        int j = high;

        for(int i = 0; i < high; i++){
            if(arr[i] > pivot){
                x++;
                swap(arr, x, j); // delete that last element; **** it did it °.° whyyyyyyy
            }
        }
        
        return 0; 
    }

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int[] sort(int[] arr, int low, int high){
        if(low < high){
            int i = pivotSearch(arr, low, high);

            pivotSearch(arr, low, high-i);
            pivotSearch(arr, low+i, high);
        }

        return arr;
    }

}
