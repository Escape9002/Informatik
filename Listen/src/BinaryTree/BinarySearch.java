package BinaryTree;

import java.util.List;

public class BinarySearch implements SearchAlgorithms{
  int[] arr = null;
    
    public BinarySearch(int[] arr) {
        this.arr = arr;
    }
    
    public BinarySearch(List<Integer> list){
        arr = new int[(list.size())-1];
        for (int i = 0; i < list.size() - 1; i++) {
            arr[i] = list.get(i);
        }
               
    }
    
    public int search(int val) {
        
        int index = Integer.MAX_VALUE;
        int high = arr.length-1;
        int low = 0;
        
        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (arr[mid] < val) {
                low = mid + 1;
            } else if (arr[mid] > val) {
                high = mid - 1;
            } else if (arr[mid] == val) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public String findAnyValue(int val) {
       
        return "NOT POSSIBLE FOR BINARY AS NOT SORTED";
    }
    
    
    
}
