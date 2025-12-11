package searching;

public class LowerBound {
    public static int lowerBound(int[] arr, int low, int high, int target) {
        if (arr.length == 0)
            return -1;

        if (low >= high) {
            if (arr[low] >= target)
                return low;
             else
                return -1;
        }
    
        int mid = (low + high) / 2;
        
        if (target == arr[mid]) {
            if (mid == 0 || arr[mid-1] != target)
                return mid;
            else
                return lowerBound(arr, low, mid - 1, target);
        } else if (target < arr[mid])
            return lowerBound(arr, low, mid - 1, target);
        else
            return lowerBound(arr, mid + 1, high, target);
    }
}
