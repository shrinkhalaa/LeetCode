import java.util.*;

class Solution {

    public ArrayList<Integer> nextSmaller(int[] arr, int n){
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];

            while (s.peek() != -1 && arr[s.peek()] >= curr) {
                s.pop();
            }

            ans.set(i, s.peek());
            s.push(i);
        }

        return ans;
    }

    public ArrayList<Integer> prevSmaller(int[] arr, int n){
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        for (int i = 0; i < n; i++) {
            int curr = arr[i];

            while (s.peek() != -1 && arr[s.peek()] >= curr) {
                s.pop();
            }

            ans.set(i, s.peek());
            s.push(i);
        }

        return ans;
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        ArrayList<Integer> next = nextSmaller(heights, n);
        ArrayList<Integer> prev = prevSmaller(heights, n);

        int area = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int length = heights[i];

            if (next.get(i) == -1) {
                next.set(i, n);
            }

            int breadth = next.get(i) - prev.get(i) - 1;
            int newArea = length * breadth;
            area = Math.max(area, newArea);
        }

        return area;
    }
}
