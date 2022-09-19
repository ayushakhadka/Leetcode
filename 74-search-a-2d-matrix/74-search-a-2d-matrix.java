class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        if (m == 0)
            return false;
        int n = matrix[0].length;

        // binary search
        int left = 0, right = m * n - 1;
        int mid, pivot;
        
        while (left <= right) {
            mid = (left + right) / 2;
            pivot = matrix[mid / n][mid % n];
            if (target == pivot)
                return true;
            else {
                if (target < pivot)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }
        return false;
    }
}