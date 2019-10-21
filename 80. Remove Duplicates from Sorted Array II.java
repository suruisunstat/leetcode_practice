class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int start = nums[0];
        int j = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != start) {
                if (count >= 2) {
                    nums[j] = start;
                    j++;
                    nums[j] = start;
                    j++;
                }
                else {
                    nums[j] = start;
                    j++;
                }
                count = 1;
                start = nums[i];
            }
            else {
                count++;
            }
        }
        
        // after the last loop
        if (count >= 2) {
            nums[j] = start;
            j++;
            nums[j] = start;
            j++;
        }
        
        else {
            nums[j] = start;
            j++;
        }
        return j;
    }
    
}

// Time: O(n)
// Space: O(1)
