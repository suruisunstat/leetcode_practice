class Solution(object):
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        # bfs
        if grid is None:
            return 0 
        ans = 0
        r = len(grid) # rows
        c = len(grid[0]) # cols
        directions = [(0,1),(0,-1),(-1,0),(1,0)]
        
        qu = collections.deque()
        for i in range(r):
            for j in range(c):
                if grid[i][j] == "1":
                    ans += 1
                    grid[i][j] = "0"
                    qu.append((i,j))
                    while qu:
                        x, y = qu.popleft()
                        for di in directions:
                            nx, ny = x + di[0], y + di[1]
                            if nx < r and nx >= 0 and ny < c and ny >= 0 and grid[nx][ny] == "1":
                                grid[nx][ny] = "0"
                                qu.append((nx,ny))
        return ans
                                
                            
                        
                        
        
        
#         if grid is None:
#             return 0 
#         ans = 0
#         r = len(grid) # rows
#         c = len(grid[0]) # cols
        
#         def dfs(grid, i, j, r, c):
#             if i < 0 or i >= r or j < 0 or j >= c or grid[i][j] == "0":
#                 return
#             grid[i][j] = "0"
#             dfs(grid, i, j + 1, r, c) # right
#             dfs(grid, i, j- 1, r, c) # left
#             dfs(grid, i - 1, j, r, c) # up
#             dfs(grid, i + 1, j, r, c) # down 
            
#         for i in range(r):
#             for j in range(c):
#                 if grid[i][j] == "1":
#                     ans = ans + 1
#                     dfs(grid, i, j, r, c)
#         return ans
    
    # Time: O(m*n)
    # Space: O(m*n)
