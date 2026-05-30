class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        List<Integer>[] list = new ArrayList[nums.length+1];

        for(int i : map.keySet()){
            int val = map.get(i);

            if(list[val] == null) list[val] = new ArrayList<>();
            list[val].add(i);
        }
        int[] arr = new int[k];
        int j = 0;
        for(int i = list.length-1; i >= 0; i--){
            if(list[i] != null){
                for(int val : list[i]){
                    arr[j++] = val;
                    if(j == k) return arr;
                }
            }
        }
        return arr;
    }
}
