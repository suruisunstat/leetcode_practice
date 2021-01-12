class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        res_list = []
        m = len(matrix)
        n = len(matrix[0])
        c1, c2, r1, r2 = 0, n-1, 0, m-1
        
        
        while r1 <= r2 and c1 <= c2: 
            print(r1,r2,c1,c2)
            for c in range(c1,c2 + 1):
                res_list.append(matrix[r1][c])
            for r in range(r1+1,r2+1):
                res_list.append(matrix[r][c2])
            if r1 < r2 and c1 < c2:
                for c in range(c2-1, c1, -1):
                    res_list.append(matrix[r2][c])
                for r in range(r2,r1, -1):
                    res_list.append(matrix[r][c1])
            r1 = r1 + 1
            r2 = r2 - 1
            c1 = c1 + 1
            c2 = c2 - 1
        return res_list
    
    # Time: O(n)
    # Space: O(1)
            
            
        
