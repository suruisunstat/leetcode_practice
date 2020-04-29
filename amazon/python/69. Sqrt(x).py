class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x < 2:
            return x
        
        if x == 3:
            return 1
        
        
        # X > 4 
        left, right = 2, x // 2 # if X > 4 this works
        # X = [6] cannot fit 
        
        while left <= right: # <= 
            mid = left + (right - left) // 2
            num = mid * mid
            if num > x:
                right = mid - 1
            elif num < x:
                left = mid + 1
            else:
                return mid 
        
        return right #right  
    
    # Test case: 6
    
    # Time: O(logn)
    # Space: O(1)
