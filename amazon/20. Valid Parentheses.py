class Solution:
    def isValid(self, s: str) -> bool:
        # stack 
        stack = []
        if s == "":
            return True
        
        if s[0] in [")","]","}"]:
            return False
        if len(s) % 2 == 1:
            return False
        
        for char in s:
            if char in ["(","[","{"]:
                stack.append(char)
            else:
                lst_item = stack[len(stack) - 1]
                if (char == ")" and lst_item == "(") or (char == "]" and lst_item == "[") or (char == "}" and lst_item == "{"):
                    stack.pop()
                else:
                    return False
        return len(stack) == 0
    
    
#         stack = []
#         mapping = {")":"(", "]": "[", "}":"{"}
        
#         for char in s:
#             if char in mapping:
#                 top_element = stack.pop() if stack else "#"
#                 if top_element != mapping[char]: 
#                     return False 
#             else:
#                 stack.append(char)
                
#         return not stack
                

    # Time:O(n)
    # Space:  O(n)
