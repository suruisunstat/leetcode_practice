class Solution {
    public int maxSubArray(int[] nums) {
        int res = helper(nums, 0, nums.length - 1);
        return res;
    }
    
    public int helper(int[] nums, int left, int right) {
        if (left >= right) return nums[left];
        int mid = (left + right) / 2;
        int lmax = helper(nums, left, mid -1);
        int rmax = helper(nums, mid + 1, right);
        int mmax = nums[mid], t = mmax;
        for (int i = mid - 1; i >= left; i--) {
            t += nums[i];
            mmax = Math.max(mmax,t);
        }
        
        t = mmax;
        
        for (int i = mid + 1; i <= right; i++) {
            t += nums[i];
            mmax = Math.max(mmax,t);
        }
        return Math.max(Math.max(lmax,rmax),mmax);
    } 
    // Divide and Conquer : O(nlogn)
    
    
    //     int max = nums[0], tmp = 0;
    //     for (int num : nums) {
    //         tmp += num;
    //         max = Math.max(max,tmp);
    //         tmp = Math.max(0, tmp);
    //     }
    //     return max;
    // }
    // Time: O(n)
    // Space: O(1)
    
        
    
}
