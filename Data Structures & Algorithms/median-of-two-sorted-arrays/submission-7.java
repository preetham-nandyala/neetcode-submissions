class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int count = 0, i = 0, j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]) arr[count++] = nums1[i++];
            else arr[count++] = nums2[j++];
        }
        while(i < nums1.length){
            arr[count++] = nums1[i++];
        }
        while(j < nums2.length){
            arr[count++] = nums2[j++];
        }

        int n = arr.length;
        return n % 2 == 0 ? (arr[n/2] + arr[(n/2)-1])/2.0 : arr[n/2]/1.0;
    }
}
