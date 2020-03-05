class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        if len(s) == 0:
            return True
        
        
        for char in s:
            if char in ["(","[","{"]:
                stack.append(char)
            elif len(stack) == 0:
                return False
            else:
                last = stack.pop()
                if not ((char == ")" and last == "(") or (char == "]" and last == "[") or (char == "}" and last == "{")):
                    return False
                             
        return len(stack) == 0
    
    ## Time: O(n)
    ## Space: O(n)
                
                
