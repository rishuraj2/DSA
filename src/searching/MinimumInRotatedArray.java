package searching;

public class MinimumInRotatedArray {
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int leastValue = nums[0];

        while (low <= high) {
            
            if (nums[low] <= nums[high]) {
                leastValue = Math.min(leastValue, nums[low]);
            }
            
            int mid = low + (high - low)/2;
            leastValue = Math.min(leastValue, nums[mid]);
            if (nums[low] <= nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return leastValue;
    }
}
