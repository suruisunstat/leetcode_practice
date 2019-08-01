class Solution {
    public int uniquePaths(int m, int n) {
        //dp
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++)
            dp[i][1] = 1;
        for(int j = 0; j <= n; j++) 
            dp[1][j] = 1;
        
        for(int i = 2; i <= m; i++) {
            for(int j = 2; j <= n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
//         for(int i =0; i < m+1; i++) {
//             for(int j = 0; j < n+1; j++) {
//                 System.out.print(dp[i][j]);
//             }
//             System.out.println();
//         }
        
        return dp[m][n];
    }
}

// O(mn)
