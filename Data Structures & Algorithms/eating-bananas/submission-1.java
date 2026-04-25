class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int i : piles){
            right  = Math.max(right, i);
        }

        while(left < right){
            int mid = left + (right - left)/2;

            if(check(piles,h,mid)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }

    public boolean check(int[] piles, int h, int mid){
        int time = 0;
        for(int i : piles){
            time += (i + mid - 1)/mid;
        }
        return time <= h;
    }
}
