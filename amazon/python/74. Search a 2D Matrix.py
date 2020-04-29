class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix is None:
            return False
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return False
        
        m = len(matrix) # nrow
        n = len(matrix[0]) # ncol
        # binary search on all
        l = 0
        r = m * n - 1
        
        while l <= r:
            mid = l + (r - l) // 2 # 5
            mid_r, mid_c = mid//n, mid%n
            cur_val = matrix[mid_r][mid_c]
            if target == cur_val:
                return True
            elif target > cur_val:
                l = mid + 1
            else:
                r = mid - 1
        
        return False
    
    # Time: O(log mn)
    # Space: O(1)
