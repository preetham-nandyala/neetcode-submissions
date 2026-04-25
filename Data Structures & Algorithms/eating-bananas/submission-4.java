class Solution {
    public boolean check(int[] nums, int h, int mid){
        int sum = 0;
        for(int i : nums){
            sum += (i + mid - 1)/mid;
        }
        return sum <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int i : piles){
            right = Math.max(right, i);
        }
        
        while(left < right){
            int mid = left + (right - left)/2;
            if(check(piles, h, mid)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}
