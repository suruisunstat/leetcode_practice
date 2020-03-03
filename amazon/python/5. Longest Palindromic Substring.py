class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        
        if len(s) == 0:
            return ""
        
        longest_length = 1
        res = s[0]
        
        for i in range(1,len(s)-1):
            temp_longest_length = 1
            center_idx = i
            expand_idx = 1
            while center_idx-expand_idx >=0 and center_idx+expand_idx < len(s) and s[center_idx-expand_idx] == s[center_idx+expand_idx]:
                temp_longest_length += 2
                expand_idx = expand_idx + 1
            if temp_longest_length > longest_length:
                longest_length = temp_longest_length
                res = s[(center_idx - expand_idx + 1): (center_idx + expand_idx)]
                
        for i in range(len(s)-1):
            center_idx = i
            expand_idx = 1
            temp_longest_length = 1
            if s[center_idx] == s[center_idx + 1]:
                temp_longest_length = 2
                while center_idx-expand_idx >=0 and center_idx+1 + expand_idx < len(s) and s[center_idx-expand_idx] == s[center_idx+expand_idx + 1]:
                    temp_longest_length += 2
                    expand_idx = expand_idx + 1
            if temp_longest_length > longest_length:
                longest_length = temp_longest_length
                res = s[(center_idx - expand_idx + 1): (center_idx + expand_idx + 1)]
                
            
        return res
    
    # Time: O(n^2)
    # Space: O(n)
                
                
            
            
        
