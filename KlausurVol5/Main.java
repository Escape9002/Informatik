public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,1,3,8,7,9};

        Quicksort quicksort = new Quicksort();
        quicksort.sort(arr, 0, (arr.length-1));


        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + " | ");
        }
    }
}
