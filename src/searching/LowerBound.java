package searching;

public class LowerBound {
    public static int lowerBound(int[] arr, int low, int high, int target) {
        int mid = (low + high) / 2;
        if (low <= high) {
            if (arr[mid] == target) {
                if (mid == 0 || arr[mid-1] != target) {
                    return mid;
                } else {
                    return lowerBound(arr, low, mid - 1, target);
                }
            } else if (target < arr[mid]) {
                return lowerBound(arr, low, mid - 1, target);
            } else {
                return lowerBound(arr, mid + 1, high, target);
            }
        }
        if (target < arr[mid])
            return mid;
        else
            return -1;
    }
}
