class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int N = grid.length;
        int sum = 0;
        int[] rowMaxes = new int[N];
        int[] colMaxes = new int[N];
        
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                rowMaxes[r] = Math.max(rowMaxes[r], grid[r][c]);
                colMaxes[c] = Math.max(colMaxes[c], grid[r][c]);
            }
        }
        
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                sum += Math.min(rowMaxes[i],colMaxes[j]) - grid[i][j];
            }
        }
        return sum;
    }
}

// Time: O(N**2)
// Space: O(N)


