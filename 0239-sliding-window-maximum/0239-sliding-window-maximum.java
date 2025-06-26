import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int j = 0;

        for (int i = 0; i < n; i++) {
            // Remove indices out of current window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller values as they are useless
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.addLast(i);

            // Store result once we have a full window
            if (i >= k - 1) {
                res[j++] = nums[dq.peekFirst()];
            }
        }

        return res;
    }
}
