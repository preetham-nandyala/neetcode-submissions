class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b)->Integer.compare(map.get(b), map.get(a)));

        return list.get(0);
        
    }
}