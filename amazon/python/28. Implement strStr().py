class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if needle == "":
            return 0
        
        if len(haystack) < len(needle):
            return -1
        
        j = 0
        i = 0
        while i < len(haystack) - len(needle) + 1:
            if haystack[i] == needle[j]:
                cur = i
                while haystack[cur] == needle[j]:
                    j = j + 1
                    cur = cur + 1
                    if j == len(needle):
                        return cur - len(needle)
                j = 0
                i = i + 1
            else:
                i = i + 1
        return -1
    
    # Time: O(n) bad 0(N * M)
    # Space: O(1)
    
                
            
        
