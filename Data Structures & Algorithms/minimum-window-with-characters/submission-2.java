class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int valid = 0;
        int left = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        HashMap<Character, Integer> str = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            str.put(s.charAt(i), str.getOrDefault(s.charAt(i),0)+1);
            if(map.containsKey(s.charAt(i)) && str.get(s.charAt(i)).equals(map.get(s.charAt(i)))){
                valid++;
            }
            while(valid == map.size()){
                if(i-left+1 < min){
                    min = i-left+1;
                    start = left;
                }
                
                str.put(s.charAt(left),str.get(s.charAt(left))-1);
                if(map.containsKey(s.charAt(left)) &&
                     str.get(s.charAt(left)) < map.get(s.charAt(left))){
                    valid--;
                }
                left++;
            }
        }
        return min == Integer.MAX_VALUE ? "": s.substring(start,start+min);
    }
}
