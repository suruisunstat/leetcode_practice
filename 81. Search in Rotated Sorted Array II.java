class Solution {
    public boolean search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (nums[mid] == target) return true;
            else if (nums[mid] > target) {
                if (nums[mid] > nums[lo]) { // left side is sorted
                    if (target < nums[lo]) {lo = mid + 1;}
                    else {hi = mid - 1;}
                }
                else if (nums[mid] == nums[lo]) {
                    lo++;
                }
                else {// right side is sorted 
                   hi = mid - 1; 
                }
            }
            
            else { // nums[mid] < target
                if (nums[mid] < nums[hi]) { // right side is sorted
                    if (target > nums[hi]) {hi = mid - 1;}
                    else lo = mid + 1;
                }
                else if (nums[mid] == nums[hi]) {
                    hi--;
                }
                else {// left side is sorted, target is larger than mid
                    lo = mid + 1;
                }
            }
        }
        return false;
        
    }
}

// O(logn) worst case O(n)
