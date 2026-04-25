class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(i == nums.length){
                count = 0;
            }
            arr[i] = nums[count++];
        }
        return arr;
    }
}