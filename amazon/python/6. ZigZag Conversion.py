class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        
        if numRows == 1:
            return s
        
        if s == "":
            return s
        
        rows = [""] * numRows
        curRow = 0
        goingDown = -1 
        
        for c in s:
            rows[curRow] = rows[curRow] + c
            #print(rows)
            if curRow == 0 or curRow == numRows - 1:
                goingDown = goingDown * -1  
            curRow = curRow + goingDown
            
        #print(rows)
        res = ""
        for row in rows:
            res += row
                
        return res
    
    ## corner cases:
    
    ## time complexity: 0(n)
    ## space complexity: O(n)
    
    
                
                

            

                
                
                
            
            
