class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int left = 0;
        int max = 0;
        int min = 0;

        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            arr[ch-'A']++;
            max = Math.max(max, arr[ch-'A']);

            while((right - left + 1)-max > k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            min = Math.max(min, (right-left+1));
        }
        return min;
    }
}
