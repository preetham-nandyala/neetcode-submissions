class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;

        int lm = 0;
        int rm = 0;
        int wl = 0;

        while(left < right){

            if(height[left] < height[right]){
                if(height[left] >= lm){
                    lm = height[left];
                }else{
                    wl += lm - height[left];
                }
                left++;
            }else{
                if(height[right] >= rm){
                    rm = height[right];
                }else{
                    wl += rm - height[right];
                }
                right--;
            }
        }
        return wl;

    }
}
