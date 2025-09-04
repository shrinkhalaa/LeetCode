import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Store all elements with their indices
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // Step 2: Check for complements
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }

        return new int[0]; // if no solution
    }
}
