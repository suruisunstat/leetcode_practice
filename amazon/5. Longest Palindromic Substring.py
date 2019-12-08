class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        
        def expandFromMiddle(s,lo,hi):
            while lo >= 0 and hi <= len(s) - 1 and s[lo] == s[hi]:
                lo = lo - 1
                hi = hi + 1
            return (lo, hi, hi - lo - 1) # s[(lo+1):hi] if lo=hi else 0
        
        if len(s) == 0:
            return ""
        
        # len(s) >= 1
        max_len = -1
        for i in range(len(s)):
            lo1, hi1, len1 = expandFromMiddle(s,i,i)
            lo2, hi2, len2 = expandFromMiddle(s,i,i+1)
            temp_max_len = max(len1,len2)
            if temp_max_len > max_len:
                max_len = temp_max_len
                if len1 > len2:
                    max_sub_str = s[(lo1+1):hi1]
                else:
                    max_sub_str = s[(lo2+1):hi2]
        return max_sub_str
                
        
        
        

# Time: O(n^2) 
# Space: O(1)
                    
                    
