class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) return 0;
        int m = grid[0].length;
        int n = grid.length;
        int[][] dp = new int[m+1][n+1];
        // System.out.println(m);
        // System.out.println(n);
        // for(int i = 0; i <=m; i++){
        //     dp[i][0] = 0;
        // }
        // for(int j = 0; j <=n; j++){
        //     dp[0][j] = 0;
        // }
        
        //dp[1][1] = grid[0][0];
        
        for(int i = 1; i <=n; i++) {
            dp[1][i] = grid[i-1][0] + dp[1][i-1];
            // System.out.println(i);
            // System.out.println(dp[1][i]);
        }
        
        for(int j = 1; j <= m; j++) {
            dp[j][1] = grid[0][j-1] + dp[j-1][1];
        }
        
        for(int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[j-1][i-1];
            }
        }
        
        // for(int i = 0; i <= m; i++) {
        //     for(int j =0; j <= n; j++) {
        //         System.out.print(dp[i][j]);
        //     }
        //     System.out.println();
        // }
        
        return dp[m][n];
    }
}

// O(mn)
// O(mn)
