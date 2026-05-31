class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int z = 0;
        int len1 = word1.length(); 
        int len2 = word2.length();
        char[] ch = new char[len1+len2];
        while(i < len1 && j < len2){
            ch[z++] = word1.charAt(i); 
            ch[z++] = word2.charAt(j);
            i++;
            j++;
        }
        while(i < len1){
            ch[z++] = word1.charAt(i); 
            i++;
        }
        while(j < len2){ 
            ch[z++] = word2.charAt(j);
            j++;
        }
        return String.valueOf(ch);
    }
}