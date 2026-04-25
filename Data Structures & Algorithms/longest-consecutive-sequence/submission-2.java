class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new TreeSet<>();
        
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int[] arr = new int[set.size()];
        Iterator it = set.iterator();
        int count = 0;
        while(it.hasNext()){
            arr[count] = (Integer)it.next();
            count++;
        }
        int max = 0;
        int length = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] == arr[i-1]+1){
                length++;
            }else{
                max = length > max ? length : max;
                length = 1;
            }
        }
        return length > max ? length : max;
    }
}
