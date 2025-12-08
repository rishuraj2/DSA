package searching;

public class BinarySearch {
    public static int binarySearch(int arr[], int low, int high, int target) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (target < arr[mid]) {
            binarySearch(arr, low, mid-1, target);
        } else {
            
        }
    }
}
