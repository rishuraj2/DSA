package arrays;

public class SortColours {
    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low -1;

        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        i++;
        nums[high] = nums[i];
        nums[i] = pivot;

        return i;
    }

    private static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = partition(nums, low, high);

            quickSort(nums, low, mid-1);
            quickSort(nums, mid+1, high);
        }
    }

    public static void sortColours(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }
}
