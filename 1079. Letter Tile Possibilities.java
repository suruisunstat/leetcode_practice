class Solution {
    public int numTilePossibilities(String tiles) {
        int[] table = new int[26];
        for(char c : tiles.toCharArray())
            table[c - 'A']++;
        int[] sol = new int[1];
        
        dfs(table,sol);
        return sol[0];
    }
    
    void dfs(int[] table, int[] sol) {
        for(int i = 0; i < table.length; i++) {
            if (table[i] > 0) {
                table[i]--;
                sol[0]++;
                dfs(table, sol);
                table[i]++;
            }
        }
    }
}
