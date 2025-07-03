import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int longest = 0;

        for (int num : set) {
            // Only check for start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int cnt = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    cnt++;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}
