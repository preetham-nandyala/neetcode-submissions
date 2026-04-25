class Solution {
    public boolean valid(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }
    public boolean validPalindrome(String s) {
        int n = s.length();
        for(int i = 0; i<n; i++){
            if(s.charAt(i) != s.charAt(n-1-i)){
                String s1 = s.substring(0,i)+s.substring(i+1);
                String s2 = s.substring(0,n-1-i)+s.substring(n-1-i+1);
                return  valid(s1) || valid(s2) ? true : false;
                     
            }
        }
        return true;
    }
}