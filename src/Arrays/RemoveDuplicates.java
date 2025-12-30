package Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int replaceIndex = 0;
        int searchIndex = 0;
        
        while (replaceIndex < nums.length-1 && searchIndex < nums.length) {
            if (nums[replaceIndex] == nums[searchIndex]) {
                searchIndex++;
            } else {
                nums[replaceIndex+1] = nums[searchIndex];
                replaceIndex++;
            }
        }

        return replaceIndex+1;
    }
}
