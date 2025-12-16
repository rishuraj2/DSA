package searching;

public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        int lastIndex = nums.length - 1;

        int low = 0;
        int high = lastIndex;

        while (low <= high){
            int mid = low + (high - low)/2;

            if (nums[mid] == target) {
                if (mid == 0 || nums[mid - 1] != target) {
                    result[0] = mid;
                    break;
                } else {
                    high = mid - 1;
                }
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        low = 0;
        high = lastIndex;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                if (mid == lastIndex || nums[mid + 1] != target) {
                    result[1] = mid;
                    break;
                } else {
                    low = mid + 1;
                }
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }
}
