class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left =0,right = matrix.length*matrix[0].length-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(matrix[mid/matrix[0].length][mid%matrix[0].length] == target) return true;
            else if(matrix[mid/matrix[0].length][mid%matrix[0].length] < target) left = mid+1;
            else right = mid-1;
        }
        return false;
    }
}
