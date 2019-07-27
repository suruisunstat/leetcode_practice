class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length; // n = 3
        // ith row become ith col
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // fold the matrix from middle
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        
        
    }
}

//Time: O(n*n)
