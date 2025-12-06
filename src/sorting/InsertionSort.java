package sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int arrLength = arr.length;

        for (int i = 1; i < arrLength; i++) {
            int j = i;

            while (j > 0) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                j--;
            }
        } 
    }
}
