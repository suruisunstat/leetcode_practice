class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int lo = 0, hi = A.length - 1;
        while (lo < hi) {
            int mid = (lo + hi)/2;
            if (A[mid+1] > A[mid])
                lo = mid + 1;
            else 
                hi = mid;
        }
        return lo;
        
        // for (int i = 0; i < A.length - 1; i++) {
        //     if (A[i] > A[i+1]) return i;
        // }
        // return -1;
    }
}
