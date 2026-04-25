class Solution {
    public boolean check(int[] piles, int mid, int h){
        int sum = 0;
        for(int i : piles){
            sum += (mid + i-1)/mid;
        }
        return sum <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i : piles){
            max = Math.max(max,i);
        }
        int left = 1;
        int right = max;
        while(left < right){
            int mid = left + (right - left)/2;
            boolean valid = check(piles, mid, h);
            if(valid){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}
