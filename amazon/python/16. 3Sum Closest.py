class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        self.best_abs_diff = float("Inf")
        self.best_sum = None
        # record the best pairs 
        nums.sort()
        
        for i in range(len(nums)):
            if i == 0 or nums[i] != nums[i-1]:
                self.twoSumII(nums, i, target)
                if self.best_sum == target:
                    return target
            # remove duplicate conditions 
        return self.best_sum
    
    
    
    
    def twoSumII(self, nums, i, target):
        lo = i + 1
        hi = len(nums) - 1
        while lo < hi:
            cur_sum = nums[i] + nums[lo] + nums[hi]
            cur_abs_diff = abs(cur_sum - target)
            if cur_abs_diff < self.best_abs_diff:
                self.best_abs_diff = cur_abs_diff
                self.best_sum = cur_sum
            if cur_sum < target:
                lo = lo + 1
                # if nums[lo+1] == nums[lo] and lo + 1 < len(nums): lo = lo + 1, similar for hi
            elif cur_sum > target:
                hi = hi - 1
            else:
                return # or return target? 
        
    # Time: O(n^2)
    # Space: O(logn) for sorting 
