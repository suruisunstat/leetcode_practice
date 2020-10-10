class Solution(object):
    def fourSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        # output = []
        # output_set = set()
        # # seek O(n^3) solution
        # nums.sort()
        # for i in range(len(nums)):
        #     for j in range(i+1, len(nums)):
        #         lo, hi = j + 1, len(nums) - 1
        #         while lo < hi:
        #             temp_sum = nums[i] + nums[j] + nums[lo] + nums[hi]
        #             if temp_sum < target:
        #                 lo = lo + 1
        #             elif temp_sum > target:
        #                 hi = hi - 1
        #             else: # equal
        #                 output_set.add(tuple(sorted([nums[i], nums[j], nums[lo], nums[hi]])))
        #                 lo = lo + 1
        #                 hi = hi - 1
        # output = list(output_set)
        # return output
    
    # I am sure there is a more elegant way to handle this, but I value time to solve better 
    # Two Pointer: O(n^3)
   
    
        ## hashset 
        output = []
        output_set = set()
        nums.sort()
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                seen = set()
                for k in range(j+1, len(nums)):
                    supplement = target - nums[i] - nums[j] - nums[k]
                    if supplement in seen:
                        output_set.add(tuple(sorted([nums[i],nums[j],nums[k], supplement])))
                    else:
                        seen.add(nums[k])
                        
        output = list(output_set)
        return output
    
    ## hashset: 
    # time: O(n^3)
    # space: O(n)
    
    
    
                    
