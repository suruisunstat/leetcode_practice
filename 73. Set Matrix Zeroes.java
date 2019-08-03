class Solution {
//     public void setZeroes(int[][] matrix) {
//         if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0)
//             return;
        
//         int m = matrix.length;
//         int n = matrix[0].length;
//         Set<Integer> row = new HashSet<>();
//         Set<Integer> col = new HashSet<>();
//         for(int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] == 0) {
//                     // ith row and jth col needs to be set to 0
//                     row.add(i);
//                     col.add(j);
//                 }
//             }
//         }
        
//         // loop to fill 0s
//         for(int r : row) {
//             for (int i = 0; i < n ;i++) {matrix[r][i] = 0;}
//         }
        
//         for(int c : col) {
//             for (int i = 0; i < m; i++) {matrix[i][c] = 0;}
//         }
//     }
    
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//         int dummy = -1000000;
        
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] == 0) {
//                     // loop over ith row
//                     for (int k = 0; k < n; k++) {
//                         if (matrix[i][k] != 0) matrix[i][k] = dummy;
//                     }
//                     // loop over jth col
//                     for (int c = 0; c < m; c++) {
//                         if (matrix[c][j] != 0) matrix[c][j] = dummy;
//                     }
//                 }
//             }
//         }
        
        
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] == dummy) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
            
        
//     }
    
    public void setZeroes(int[][] matrix) {
        boolean isCol = false;
        int R = matrix.length;
        int C = matrix[0].length;
        for (int i = 0; i < R; i++) {
            if (matrix[i][0] == 0) {
                isCol = true;
            }
            for (int j = 1; j < C; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        if (matrix[0][0] == 0) {
            for (int j = 0; j < C; j++) {
                matrix[0][j] = 0;
            }
        }
        
        if(isCol) {
            for (int i = 0; i < R; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

// O(1) space
// O(mn) time
