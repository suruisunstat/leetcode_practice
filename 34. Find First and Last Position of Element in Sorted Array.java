class Solution {
    
    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int lo = 0;
        int hi = nums.length; // cannot use nums.length - 1
        
        while (lo < hi) {
            int mid = (lo + hi)/2;
            if (nums[mid] > target || (left && nums[mid] == target)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo; 
    }
    
    public int[] searchRange(int[] nums, int target) {
        int[] targetRange = {-1, -1};
        int leftIdx = extremeInsertionIndex(nums,target,true);
        if (leftIdx == nums.length || nums[leftIdx] != target) {
            return targetRange;
        }
        
        int rightIdx = extremeInsertionIndex(nums,target,false) - 1; // because rightIdx -1 here 
        targetRange[0] = leftIdx;
        targetRange[1] = rightIdx;
        return targetRange;
        
    }
}

// Time: O(logn)
// Space: O(1)
