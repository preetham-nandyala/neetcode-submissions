class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;

        int lm = 0;
        int rm = 0;
        int max = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= lm) lm = height[left];
                else max += lm - height[left];
                left++;
            }else{
                if(height[right] >= rm) rm = height[right];
                else max += rm - height[right];
                right--;
            }
        }
        return max;
    }
}
