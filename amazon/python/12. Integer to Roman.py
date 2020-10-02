class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        # specials = {4: "IV", 9: "IX", 40: "XL", 90: "XC", 400: "CD", 900: "CM"}
        # if num in specials:
        #     return specials[num] # 1994
        
        digits = [(1000, "M"),(900, "CM"), (500, "D"),(400,"CD"),(100,"C"),(90,"XC"),(50,"L"),(40,"XL"),(10,"X"),(9,"IX"),(5,"V"),(4,"IV"),(1,"I")]
        
        res = ""
        for value, symbol in digits:
            count, num = divmod(num, value)
            res = res + count * symbol
            if num == 0:
                break
            
        return res
        
#         res = ""
#         digit4 = num // 1000 # because input is at most 3999 
#         res = res + "M" *digit4
#         print(res)
#         num = num % 1000 # 994
        
#         digit3 = num // 100 # 9
#         if digit3 == 4:
#             res = res + "CD"
#         elif digit3 == 9:
#             res = res + "CM"
#         elif digit3 < 5:
#             res = res + "C" * digit3
#         else:
#             res = res + "D" + "C" * (digit3 - 5)
#         print(res)
#         num = num % 100 # 94 
        
#         digit2 = num // 10 # 9
#         if digit2 == 4:
#             res = res + "XL"
#         elif digit2 == 9:
#             res = res + "XC"
#         elif digit2 < 5:
#             res = res + "X" * digit2
#         else:
#             res = res + "L" + "X" * (digit2 - 5)
        
#         print(res)
#         num = num % 10 # 4
#         digit1 = num
#         print(digit1)
#         if digit1 == 4:
#             res = res + "IV"
#         elif digit1 == 9:
#             res = res + "IX"
#         elif digit1 < 5:
#             res = res + "I" * digit1
#         else:
#             res = res + "V" + "I" * (digit1 - 5)
#         print(res)
#         return res


    
    ## Time: O(1)
    ## Space: O(1)
