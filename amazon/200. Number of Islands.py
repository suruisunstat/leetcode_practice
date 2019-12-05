class Solution(object):
    
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        nrow = len(grid)
        if nrow == 0: 
            return 0
        ncol = len(grid[0])
        if ncol == 0:
            return 0
        num_islands = 0
        
        
        for i in range(nrow):
            for j in range(ncol):
                if grid[i][j] == '1':
                    num_islands = num_islands + 1
                    self.dfs(grid,i,j)
        return num_islands
    
    def dfs(self,grid,i,j):
        if i < 0 or j < 0 or i > len(grid) - 1 or j > len(grid[0]) - 1 or grid[i][j] != '1':
            return
        else:
            grid[i][j] = '0'
        self.dfs(grid,i-1,j)
        self.dfs(grid,i+1,j)
        self.dfs(grid,i,j-1)
        self.dfs(grid,i,j+1)
            
# Time: O(M * N)
# Space: O(M * N)
    
