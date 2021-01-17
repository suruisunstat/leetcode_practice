class Solution(object):
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """
        matrix = [[0 for i in range(n)] for _ in range(n)]
        left, right, top, bottom = 0, n-1, 0, n-1 
        #r, c = 0, 0
        i = 0
        #print(matrix)
        while left <= right and top <= bottom:
            for c1 in range(left, right+1):
                i = i + 1
                matrix[top][c1] = i
            # print("loop 1")
            # print(matrix)
            top = top + 1
            for r1 in range(top, bottom+1):
                i = i + 1
                matrix[r1][right] = i
            right = right - 1
            # print("loop 2")
            # print(matrix)
            
            for c2 in range(right, left-1, -1):
                i = i + 1
                matrix[bottom][c2] = i
            bottom = bottom - 1 
            # print('loop 3')
            # print(matrix)
            for r2 in range(bottom, top-1, -1):
                i = i + 1
                matrix[r2][left] = i
            left = left + 1
            # print("loop 4")
            # print(matrix)
        return matrix 
        # Time: o(n^2)
        # Space: o(n^2)

    
        
