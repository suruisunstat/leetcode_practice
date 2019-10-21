class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean [][] visited = new boolean[m][n];
        
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j, visited)) return true;
            }
        }
        return false;
        
    }
    
    public boolean dfs(char[][] board, String word, int index, int rowIndex, int colIndex, boolean[][] visited) {
        if (index == word.length()) return true;
        if (rowIndex < 0 || rowIndex >= board.length || colIndex < 0 || colIndex >= board[0].length) return false;
        if (visited[rowIndex][colIndex]) return false;
        if (board[rowIndex][colIndex] != word.charAt(index)) return false;
        
        visited[rowIndex][colIndex] = true;
        boolean res = dfs(board, word, index + 1, rowIndex - 1, colIndex, visited) || dfs(board, word, index + 1, rowIndex + 1, colIndex, visited) || dfs(board, word, index + 1, rowIndex, colIndex + 1, visited) || dfs(board, word, index + 1, rowIndex, colIndex - 1,visited);
        
        visited[rowIndex][colIndex] = false;
        return res;
        
    }
}
