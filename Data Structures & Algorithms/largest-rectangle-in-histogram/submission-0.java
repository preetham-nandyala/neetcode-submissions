class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int n = heights.length;

        int[] right = new int[n];
        for(int i = n-1; i>=0; i--){
            while(s.size() > 0 && heights[i] <= heights[s.peek()]){
                s.pop();
            }
            right[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }

        while(!s.isEmpty()){
            s.pop();
        }

        int[] left = new int[n];
        for(int i = 0; i< n; i++){
            while(s.size()>0 && heights[i] <= heights[s.peek()]){
                s.pop();
            }

            left[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        int max = 0;
        for(int i = 0; i<n; i++){
            int width = right[i] - left[i] - 1;
            int height = heights[i];
            int area = width * height;
            max = Math.max(max, area);
        }
        return max;
    }
}
