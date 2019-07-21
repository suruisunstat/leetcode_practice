class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0)
            return false;
        int row = 0, col = matrix[0].length - 1;
        while (row <= matrix.length - 1 && col >= 0) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] < target) row++;
            else col--;
        }
        return false;
    }
        
        
//         if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0)
//             return false;
        
//         int loRow = 0, hiRow = matrix.length - 1;
//         while (loRow < hiRow) {
//             int mid = (loRow + hiRow)/2;
//             if (matrix[mid][0] == target) return true;
//             else if (matrix[mid][0] < target) loRow = mid + 1;
//             else hiRow = mid - 1;
//         }
//         for (int i = 0; i <= hiRow; i++) {
//             if (binary_search(matrix[i], target))
//                 return true;
//         }
//         return false;
        
        // for (int i = 0; i < matrix.length; i++) {
        //     if (binary_search(matrix[i], target))
        //         return true;
        // }
        // return false;
    
    // public boolean binary_search(int[] row, int target) {
    //     int lo = 0;
    //     int hi = row.length - 1;
    //     while (lo <= hi) {
    //         int mid = (lo + hi)/2;
    //         if (row[mid] == target) return true;
    //         else if (row[mid] > target) hi = mid - 1;
    //         else lo = mid + 1;
    //     }
    //     return false;
    // }
}

// Time: O(m+n) if using the second method: divide and conquer
// Time: m * O(logn) worst senario if we do two binary search 
