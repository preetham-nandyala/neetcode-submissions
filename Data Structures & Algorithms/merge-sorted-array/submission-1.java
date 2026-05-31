class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = 0;
        for(int i = m ; i < m+n; i++){
            nums1[i] = nums2[x++];
        }
        for(int i = 0; i< m+n; i++){
            for(int j = i+1; j< m+n; j++){
                if(nums1[i] > nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
}