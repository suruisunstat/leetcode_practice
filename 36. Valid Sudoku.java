class Solution {
    public boolean isValidSudoku(char[][] board) {
        // check row wise
        for(int i = 0; i < board.length; i++) {
            Map<Character,Integer> rowCount = new HashMap<>();
            for (int j = 0; j <board[0].length; j++) {
                char cur = board[i][j];
                if (cur != '.'){
                    rowCount.put(cur, rowCount.getOrDefault(cur,0) + 1);
                    if (rowCount.get(cur) > 1)
                        return false;
                }
            }
        }
        
        //check col wise
        for(int j = 0; j < board[0].length; j++) {
            Map<Character,Integer> colCount = new HashMap<>();
            for (int i = 0; i <board.length; i++) {
                char cur = board[i][j];
                if (cur != '.') {
                    colCount.put(cur, colCount.getOrDefault(cur,0) + 1);
                    if (colCount.get(cur) > 1)
                        return false;
                }
            }
        }
        
        // check 3 by 3 sub boxes
        
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char[] subBox = new char[9];
                subBox[0] = board[3*i][3*j];
                subBox[1] = board[3*i][3*j+1];
                subBox[2] = board[3*i][3*j+2];
                subBox[3] = board[3*i + 1][3*j];
                subBox[4] = board[3*i + 1][3*j+1];
                subBox[5] = board[3*i + 1][3*j+2];
                subBox[6] = board[3*i + 2][3*j];
                subBox[7] = board[3*i + 2][3*j+1];
                subBox[8] = board[3*i + 2][3*j+2];
                
                Map<Character, Integer> subCount = new HashMap<>();
                for (int k =0; k < subBox.length; k++) {
                    char cur = subBox[k];
                    if (cur != '.'){
                        subCount.put(cur, subCount.getOrDefault(cur,0) + 1);
                        if (subCount.get(cur) > 1)
                            return false;
                    }
                } 
            }
        }
        return true;
    }
}
// brute force: O(n*n)
