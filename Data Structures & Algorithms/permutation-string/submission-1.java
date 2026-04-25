class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] freq = new int[26];
        for(char ch : s1.toCharArray()){
            freq[ch - 'a']++;
        }
        int left = 0, length = s1.length();
        for(int i = 0; i< s2.length(); i++){
            if(freq[s2.charAt(i) - 'a']>0){
                length--;
            }
            freq[s2.charAt(i)-'a']--;
            if(length == 0) return true;

            if(i - left+1 == s1.length()){
                if(freq[s2.charAt(left)-'a'] >= 0){
                    length++;
                }
                freq[s2.charAt(left)-'a']++;
                left++;
            }
        }
        return false;
    }
}
