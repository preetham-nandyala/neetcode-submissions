class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        int j = 0;
        for(int i : nums){
            arr[j] = i;
            arr[nums.length+j++] = i;
        }
        return arr;
    }
}