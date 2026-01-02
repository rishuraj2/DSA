package arrays;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int maxTempCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                maxTempCount++;
            else {
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, maxTempCount);
                maxTempCount = 0;
            }
        }

        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, maxTempCount);

        return maxConsecutiveOnes;
    }
}