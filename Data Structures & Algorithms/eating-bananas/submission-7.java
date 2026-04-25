class Solution {
    public static boolean check(int m, int[] p, int h){
        int total = 0;
        for(int i : p){
            total += (m + i - 1)/m;
        }
        return total <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int i : piles){
            right = Math.max(right,i);
        }
        
        while(left < right){
            int mid = left + (right - left)/2;
            if(check(mid,piles,h)) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
