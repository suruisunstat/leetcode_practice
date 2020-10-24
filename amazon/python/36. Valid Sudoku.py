class Solution(object):
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        
        # n_rows = len(board) # 9
        # n_cols = len(board[0]) # 9
        
        #digits_set = set([str(i) for i in range(1,10)])
        
        # check rows
        for i in range(9):
            temp_row_dict = set()
            for j in range(9):
                cur = board[i][j]
                if cur == '.':
                    continue
                elif cur not in temp_row_dict:
                    temp_row_dict.add(cur)
                else:
                    print("row")
                    print(i,j, cur)
                    return False
                
        # check cols
        for j in range(9): #
            temp_col_dict = set()
            for i in range(9):
                cur = board[i][j]
                if cur == '.':
                    continue
                elif cur not in temp_col_dict:
                    temp_col_dict.add(cur)
                else:
                    print("col")
                    print(i, j, cur)
                    return False
                
        
        # check 3* 3 cells
        
        for i in range(3):
            for j in range(3):
                temp_cell_dict = set()
                for k in range(3):
                    for l in range(3):
                        cur = board[i*3+k][j*3+l]
                        if cur == ".":
                            continue
                        elif cur not in temp_cell_dict:
                            temp_cell_dict.add(cur)
                        else:
                            print("cell")
                            print(i, j, cur)
                            return False
        return True
    
    # Time: o(n^2)
    # Space: o(n)
                        
                
                
        
                
        
        
        
