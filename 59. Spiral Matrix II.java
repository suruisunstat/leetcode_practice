class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int r = 0, c = 0;
        int maxr = n - 1, maxc = n - 1;
        int minr = 0, minc = 0;
        int num = 1;
        while (maxr >= minr && maxc >= minc) {
            for (int i = minc; i <= maxc; i++) {
                res[minr][i] = num;
                num++;
            }
            minr++;
            // break
            //if (minr > maxr) break;
            for (int i = minr; i <= maxr; i++) {
                res[i][maxc] = num;
                num++;
            }
            maxc--;
            //break
            //if (minc > maxc) break;
            for(int i = maxc; i >= minc; i--) {
                res[maxr][i] = num;
                num++;
            }
            maxr--;
            
            for(int i = maxr; i >= minr; i--) {
                res[i][minc] = num;
                num++;
            }
            minc++;
        }
        
        return res;
    }
}
