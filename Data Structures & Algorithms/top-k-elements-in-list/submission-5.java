class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        List<Integer> list = map.entrySet()
                                .stream()
                                .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                                .map(Map.Entry::getKey)
                                .collect(Collectors.toList());
        int[] arr = new int[k];
        for(int i = 0; i < k; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
