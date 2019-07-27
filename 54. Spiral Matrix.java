class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>(); 
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0)
            return res;
        int row, col;
        int minCol = 0, minRow = 0;
        int maxRow = matrix.length - 1, maxCol = matrix[0].length - 1;
        
        
        while (minCol <= maxCol && minRow <= maxRow) {
            // move right
            for(col = minCol; col <= maxCol; col++) {
                res.add(matrix[minRow][col]);
            }
            minRow++;
            if (minRow > maxRow) break;
            // move down
            for(row = minRow; row <= maxRow; row++) {
                res.add(matrix[row][maxCol]);
            }
            maxCol--;
            if (minCol > maxCol) break;
            // move left
            for(col = maxCol; col >= minCol; col--) {
                res.add(matrix[maxRow][col]);
            }
            maxRow--;
            if (minRow > maxRow) break;
            //move up
            for(row = maxRow; row >= minRow; row--) {
                res.add(matrix[row][minCol]);
            }
            minCol++;
        }
        return res;
    }
}

// O(m * n)
