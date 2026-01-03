package arrays;

import java.util.*;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> countRegister = new HashMap<>();
        int numsLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            countRegister.put(nums[i], countRegister.getOrDefault(nums[i], 0) + 1);
            if (countRegister.get(nums[i]) > numsLength/2) {
                return nums[i];
            }
        }

        return 0;
    }
}
