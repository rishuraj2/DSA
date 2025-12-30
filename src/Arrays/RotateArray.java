package Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int numsLength = nums.length;
        k = numsLength - (k%numsLength);
        
        int[] result = new int[nums.length];
        int resIndex = 0;

        for (int i = k; i < k + numsLength; i++) {
            result[resIndex] = nums[i % numsLength];
            resIndex++;
        }
        for (int i = 0; i < numsLength; i++) {
            nums[i] = result[i];
        }
    }
}
