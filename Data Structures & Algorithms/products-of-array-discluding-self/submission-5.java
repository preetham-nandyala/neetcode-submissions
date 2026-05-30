class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        a[0] = 1;
        for(int i = 1; i < n; i++){
            a[i] = nums[i-1] * a[i-1];
        }
        int x = 1;
        for(int i = n-2; i>0; i--){
            x = x*nums[i+1];
            a[i] = a[i] * x;
        }
        a[0] = x*nums[1];
        return a;
    }
}  
