class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int max = 0;
        for(int i : nums){
            if(!set.contains(i-1)){
                int current = i;
                int count = 1;

                while(set.contains(current + 1)){
                    current++;
                    count++;
                }
                max = Math.max(max, count);
            }
            
        }
        return max;
    }
}
