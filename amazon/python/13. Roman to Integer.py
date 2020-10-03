class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
#         mappings = [("M",1000), ("CM", 900), ("D", 500), ("CD", 400), ("C", 100), ("XC", 90), ("L", 50), ("XL", 40), ("X", 10), ("IX", 9), ("V", 5), ("IV", 4), ("I", 1)]
        
        res = 0
        i = 0 # index 
        
        while i < len(s):
            if s[i] == "M":
                res += 1000
            elif s[i] == "D":
                res += 500
            elif s[i] == "C":
                if i < len(s) - 1 and s[i+1] == "M":
                    res += 900
                    i = i + 1
                elif i < len(s) - 1 and s[i+1] == "D":
                    res += 400
                    i = i + 1
                else:
                    res += 100
            elif s[i] == "L":
                res += 50
            elif s[i] == "X":
                if i < len(s) - 1 and s[i+1] == "C":
                    res += 90
                    i = i + 1
                elif i < len(s) - 1 and s[i+1] == "L":
                    res += 40
                    i = i + 1
                else:
                    res += 10
            elif s[i] == "V":
                res += 5
            elif s[i] == "I":
                if i < len(s) - 1 and s[i+1] == "X":
                    res += 9
                    i = i + 1
                elif i < len(s) - 1 and s[i+1] == "V":
                    res += 4
                    i = i + 1
                else:
                    res += 1
            i = i + 1
        return res
    
    # Time: O(n) # O(1) if the input is fixed <= 3999
    # Space: O(1)
