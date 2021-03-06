class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {return 0;}
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid,i,j,rows,cols);
                }
            }
        }
        return count;
    }
    
    
    public void dfs(char[][] grid, int i, int j, int rows, int cols) {
        if (i < 0 || i >= rows || j < 0 || j >= cols) {return;}
        if (grid[i][j] != '1') {return;}
        grid[i][j] = '0';
        dfs(grid,i-1,j,rows,cols);
        dfs(grid,i+1,j,rows,cols);
        dfs(grid,i,j-1,rows,cols);
        dfs(grid,i,j+1,rows,cols);
    }
}
