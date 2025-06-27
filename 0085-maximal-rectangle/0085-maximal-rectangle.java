class Solution {

    static public ArrayList<Integer> nextSmaller(int[] arr, int n) {
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

    public ArrayList<Integer> prevSmaller(int[] arr, int n) {
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
        for (int i = 0; i < n; i++) {
            int length = heights[i];
            if (next.get(i) == -1) next.set(i, n);
            int breadth = next.get(i) - prev.get(i) - 1;
            int newArea = length * breadth;
            area = Math.max(area, newArea);
        }
        return area;
    }

    // Converts char matrix to histogram and calculates max area
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        int n = matrix.length;
        int m = matrix[0].length;

        // Create histogram heights array
        int[] heights = new int[m];
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            // Build histogram row
            for (int j = 0; j < m; j++) {
                // Convert char to int (from '1'/'0')
                if (matrix[i][j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }
            // Get max area in this histogram row
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }
}
