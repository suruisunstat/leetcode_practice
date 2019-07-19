class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        
        
        while (left <= right) {
            if (nums[left] == target) return left;
            if (nums[right] == target) return right;
            int middle = (left + right) / 2;
            int middleVal = nums[middle];
            
            if (middleVal == target) return middle;
            
            if (middleVal > nums[left]) {
                // left side must be ascending order 
                if (target > nums[left] && target < middleVal) {
                    right = middle - 1;
                }
                else {
                    left = middle + 1;
                }
            }
            
            else {
                // right side must be ascending order
                if (target > middleVal && target < nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
                
            }
        }
        return -1;
    }
}

// Time: O(logn)
//  Space: O(1)
