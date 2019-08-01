class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0] == null || obstacleGrid[0].length == 0) return 0;
        int m = obstacleGrid[0].length;
        int n = obstacleGrid.length;
        int[][] dp = new int[m+1][n+1];
        
        for(int i = 1; i <= m; i++) {
            if (obstacleGrid[0][i-1] == 0)
                dp[i][1] = 1;
            else {
                dp[i][1] = 0;
                break;
            }
        }
        
        for(int j = 1; j <= n; j++) {
            if (obstacleGrid[j-1][0] == 0)
                dp[1][j] = 1;
            else {
                dp[1][j] = 0;
                break;
            }
        }
        
        
        for(int i = 2; i <= m; i++) {
            for(int j = 2; j <= n; j++) {
                if (obstacleGrid[j-1][i-1] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        
        // for(int i = 0; i <= m; i++) {
        //     for(int j = 0; j <= n; j++) {
        //         System.out.print(dp[i][j]);
        //     }
        //     System.out.println();
        // }
        return dp[m][n];
    }
}

// O(mn)
//  O(mn)
