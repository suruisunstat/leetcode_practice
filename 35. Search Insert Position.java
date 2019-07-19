class Solution {
    public int searchInsert(int[] nums, int target) {
        
        //if (target < nums[0]) return 0;
        if (target > nums[nums.length - 1]) return nums.length;
        
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = (lo + hi)/2;
            if (nums[mid] == target) { return mid;}
            else if (nums[mid] > target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        // if (lo == 0) {
        //     if (nums[lo] < target) return 1;
        //     else return 0; 
        // }
        return lo;
    }
}

// Time: O(logn)
// Space: O(1)
