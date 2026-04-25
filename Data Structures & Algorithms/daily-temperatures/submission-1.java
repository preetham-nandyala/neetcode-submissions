class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i = 0; i< temperatures.length; i++){
            while(!s.isEmpty() && temperatures[i] > temperatures[s.peek()]){
                int val = s.pop();
                result[val] = i - val;
            }
            s.add(i);
        }
        return result;
    }
}
