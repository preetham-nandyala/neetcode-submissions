class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str = "";

        int i = 0;
        int j = 0;
        while(i<word1.length() && j<word2.length()){
            String s = String.valueOf(word1.charAt(i++));
            String t = String.valueOf(word2.charAt(j++));
            str += s+t;
        }
        while(i<word1.length()){
            String s = String.valueOf(word1.charAt(i++));
            str += s;
        }
        while(j<word2.length()){
            String t = String.valueOf(word2.charAt(j++));
            str += t;
        }
        return str;
    }
}