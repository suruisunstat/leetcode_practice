/*
Given array nums = [-1, 2, 1, -4], and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[nums.length-1];
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i+1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                if (sum > target) {
                    end--;
                }
                else {
                    start++;
                }
                if (Math.abs(sum-target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }
}
