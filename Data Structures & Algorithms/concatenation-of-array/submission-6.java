class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        int j = 0;
        for(int i : nums){
            arr[j] = arr[n+j++] = i;
        }
        return arr;
    }
}