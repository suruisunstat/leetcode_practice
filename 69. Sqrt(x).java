class Solution {
    // public int mySqrt(int x) {
    //     if (x <= 1) return x;
    //     int lo = 1;
    //     int hi = x; // 8
    //     while (lo < hi) {
    //         int mid = lo + (hi - lo)/2;
    //         if (x/mid >= mid) {lo = mid + 1;} //yes
    //         else {hi = mid; }
    //     }
    //     return hi - 1;
    // }
    
    public int mySqrt(int x) {
        double res = 1, pre = 0;
        while (Math.abs(res - pre) > 1e-6) {
            pre = res;
            res = (res + x/res)/2;
        }
        return (int)res;
    }
}

// newton method
// binary search  
