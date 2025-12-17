package searching;

public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length -1;

        while (low < high) {
            int mid = low + (high - low)/2;

            if (mid == low) {
                if (nums[low] > nums[high]) {
                    return low;
                } else {
                    return high;
                }
            }

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (nums[mid - 1] < nums[mid] && nums[low] < nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
