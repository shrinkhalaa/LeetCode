class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            max = Math.max(max, h * w);

            // Move the shorter line inward
            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return max;
    }
}
