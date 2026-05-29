class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
            int[] arr = new int[26];
            String s = strs[i];
            for(char ch : s.toCharArray()){
                arr[ch-'a']++;
            }
            String key = Arrays.toString(arr);
            if(!map.containsKey(key)) map.put(key,new ArrayList<>());
            map.get(key).add(s);
        } 
        return new ArrayList<>(map.values());
    }
}
