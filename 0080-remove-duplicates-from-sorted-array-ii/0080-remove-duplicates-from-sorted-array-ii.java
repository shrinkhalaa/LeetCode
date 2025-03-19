class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length; 

        int i = 1; // Tracks the last valid position
        int count = 1; // Count occurrences of the current number

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[j - 1]) { 
                count++; 
            } else {
                count = 1; // Reset count when a new element appears
            }

            if (count <= 2) { 
                nums[i] = nums[j]; // Place valid element
                i++; // Move to the next position
            }
        }

        return i; // `i` now represents the new length
    }
}
