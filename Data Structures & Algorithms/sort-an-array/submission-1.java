class Solution {
    public int[] sortArray(int[] nums) {
    
        for(int i = 0; i< nums.length; i++){
            int temp = i;
            for(int j = i+1; j<nums.length; j++){
                if(nums[temp] > nums[j]) temp = j;
            }
            int t = nums[i];
            nums[i] = nums[temp];
            nums[temp] = t;
        }
        return nums;
    }
}