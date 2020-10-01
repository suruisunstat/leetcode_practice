class Solution(object):
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        s = str.strip()
        
        if len(s) == 0:
            return 0
        
        if s[0] not in ["+","-","0","1","2","3","4","5","6","7","8","9"]:
            return 0
        
        sign = 0
        if s[0] == "+":
            sign = 1
        if s[0] == "-":
            sign = -1
        
        s_new = ""
        for idx, ch in enumerate(s):
            if idx == 0 and (ch == "+" or ch == "-"):
                continue
            if idx != 0 and ch not in ["0","1","2","3","4","5","6","7","8","9"]:
                break
            s_new = s_new + ch
        
        
        num_res = 0
        len1 = len(s_new)
        for idx, ch in enumerate(s_new):
            num_res = num_res + int(ch) * (10 ** (len1 - 1 - idx))
            
        if sign == -1:
            num_res = num_res * -1
        
        if num_res > 2 ** 31 - 1:
            return 2 ** 31 - 1
        elif num_res < - 2 ** 31:
            return - 2 ** 31
        else:
            return num_res
            
## Time: O(n)
## Space: O(n): we can also use only constant space, result = result * 10 + ch
            
            
            
                
            
        
        
        
