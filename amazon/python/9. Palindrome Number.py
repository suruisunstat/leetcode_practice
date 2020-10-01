class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        #return str(x) == str(x)[::-1]
        if x < 0 or (x % 10 == 0 and x != 0):
            return False
        revert = 0
        while x > revert:
            revert = revert * 10 + x % 10
            x = x//10
        
        return x == revert or x == revert // 10
    
    ## remember the trick helps to solve this question: time O(logn) space O(1)
