class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int right = m * n -1;
        int left = 0;

        while(left <= right){
            int mid = left + (right - left)/2;

            int row = mid / n;
            int col = mid % n;

            int val = matrix[row][col];
            if(val == target) return true;
            if(val < target) left = mid+1;
            else right = mid - 1;
        }
        return false;
    }
}
