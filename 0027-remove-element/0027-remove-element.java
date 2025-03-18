class Solution {
    public int removeElement(int[] nums, int val) {
        int j = nums.length - 1, count = nums.length;

        for (int i = 0; i <= j; i++) {
            if (nums[i] == val) {
                while (j > i && nums[j] == val) { 
                    j--; // Move j left until we find a non-val element
                    count--; // Reduce count for each val found at the end
                }
                if (j > i) {
                    // Swap nums[i] with nums[j]
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    
                    j--; // Move j left after swapping
                    count--; // Reduce count as val is removed
                }
                else {
                    count--; // Reduce count for last remaining val
                }
            }
        }
        return count;
    }
}
