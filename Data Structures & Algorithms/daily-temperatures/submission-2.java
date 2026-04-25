class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int val = st.pop();
                res[val] = i - val;
            }
            st.push(i);
        }
        return res;
    }
}
