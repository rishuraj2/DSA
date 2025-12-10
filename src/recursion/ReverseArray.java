package recursion;

public class ReverseArray {
    public static void reverseArray(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = (low+high)/2;
        reverseArray(arr, low, mid);
        reverseArray(arr, mid+1, high);
        int secondArrayStart = ((low+high)/2)+1;
        for (int i = low; i < secondArrayStart; i++) {
            int temp = arr[secondArrayStart + (i-low)];
            arr[secondArrayStart + (i-low)] = arr[i];
            arr[i] = temp;
        }
    }
}
