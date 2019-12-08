class Solution(object):
    
#     def numIslands(self, grid):
#         """
#         :type grid: List[List[str]]
#         :rtype: int
#         """
#         nrow = len(grid)
#         if nrow == 0: 
#             return 0
#         ncol = len(grid[0])
#         if ncol == 0:
#             return 0
#         num_islands = 0
        
        
#         for i in range(nrow):
#             for j in range(ncol):
#                 if grid[i][j] == '1':
#                     num_islands = num_islands + 1
#                     self.dfs(grid,i,j)
#         return num_islands
    
#     def dfs(self,grid,i,j):
#         if i < 0 or j < 0 or i > len(grid) - 1 or j > len(grid[0]) - 1 or grid[i][j] != '1':
#             return
#         else:
#             grid[i][j] = '0'
#         self.dfs(grid,i-1,j)
#         self.dfs(grid,i+1,j)
#         self.dfs(grid,i,j-1)
#         self.dfs(grid,i,j+1)
        
    def numIslands(self, grid):
        # bfs
        
        nrow = len(grid)
        if nrow == 0:
            return 0
        ncol = len(grid[0])
        
        if ncol == 0:
            return 0
        n_islands = 0
        
        stack = []
        for i in range(nrow):
            for j in range(ncol):
                if grid[i][j] == '1':
                    n_islands = n_islands + 1
                    stack.append(i* ncol + j)
                    grid[i][j] = '0'
                    while len(stack) > 0:
                        val = stack.pop(0)
                        temp_row = val / ncol
                        temp_col = val % ncol
                        #grid[temp_row][temp_col] = '0'
                        # left
                        if temp_col > 0 and grid[temp_row][temp_col - 1] == "1":
                            stack.append(temp_row * ncol + temp_col - 1)
                            grid[temp_row][temp_col - 1] = '0'
                        # right
                        if temp_col < ncol - 1 and grid[temp_row][temp_col + 1] == "1":
                            stack.append(temp_row * ncol + temp_col + 1)
                            grid[temp_row][temp_col + 1] = '0'
                        # up
                        if temp_row > 0 and grid[temp_row-1][temp_col] == "1":
                            stack.append((temp_row - 1) * ncol + temp_col)
                            grid[temp_row - 1][temp_col] = '0'
                        # down
                        if temp_row < nrow - 1 and grid[temp_row + 1][temp_col] == "1":
                            stack.append((temp_row + 1) * ncol + temp_col)
                            grid[temp_row + 1][temp_col] = '0'
                        
        
        return n_islands 
# Time: O(M * N)
# Space: O(M * N)
    
