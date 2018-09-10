/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       	Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
				int lo = i+1;
				int hi = nums.length - 1;
				int sum = - nums[i];
				while (lo < hi) {
					if (nums[lo] + nums[hi] == sum) {
						res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
						while (nums[lo] == nums[lo+1] && lo < nums.length - 2) lo++;
						while (nums[hi] == nums[hi-1] && hi > 1) hi--;
						lo++;
						hi--;
					}
					else if (nums[lo] + nums[hi] < sum) {
						lo++;
					}
					else hi--;
				}
			}
		}
		return res;
    }
}

