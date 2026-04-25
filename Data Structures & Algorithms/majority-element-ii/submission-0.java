class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int k = (nums.length/3);
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }  
        List<Integer> list = new ArrayList<>();
        for(int i : mp.keySet()){
            if(mp.get(i) > k){
                list.add(i);
            }
        }    
        return list;                                                                                                                                                                                                   
    }
}