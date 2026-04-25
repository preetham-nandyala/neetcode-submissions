class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        for(int i = 1; i<nums.length; i++){
            min = nums[i] < min ? nums[i] : min;
        }
        return min;
    }
}
