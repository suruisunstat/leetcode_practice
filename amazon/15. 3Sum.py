class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        
        ## two sum: O(n)
        ## three sum: O(n^2)
        
        
        # def twoSum(self, nums, target):
        #     dict1 = {}
        #     for i in range(len(nums)):
        #         remain = target - nums[i]
        #         if remain not in dict1:
        #             dict1[nums[i]] = i
        #         else:
        #             return [i,dict1[remain]]
                
        # res_set = set()
        # nums = sorted(nums)
        # for j, num in enumerate(nums):
        #     if num > 0:
        #         break
        #     if j > 0 and num == nums[j-1]:
        #         continue
        #     dict1 = {}
        #     for i in range(j+1, len(nums)):
        #         remain = -num - nums[i]
        #         if remain not in dict1:
        #             dict1[nums[i]] = i
        #         else:
        #             res_set.add((num,nums[i],remain))   
        # return res_set
    
        res_set = set()
        nums = sorted(nums)
        for j, num in enumerate(nums):
            if num > 0:
                break
            if j > 0 and num == nums[j-1]:
                continue
            lo, hi = j+1, len(nums) - 1
            while lo < hi:
                sum1 = num + nums[lo] + nums[hi]
                if sum1 == 0:
                    res_set.add((num,nums[lo],nums[hi]))
                    lo = lo + 1
                    hi = hi - 1
                elif sum1 > 0:
                    hi = hi - 1
                else: # sum1 < 0
                    lo = lo + 1 
        return res_set
    # Time: O(n^2)
    # Space: O(n)
