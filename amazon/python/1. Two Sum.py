class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        # h = {}
        # for i, num in enumerate(nums):
        #     n = target - num
        #     if n not in h:
        #         h[num] = i
        #     else:
        #         return [h[n], i]
        
        dic = {}
        
        for i, num in enumerate(nums):
            remain = target - num
            if remain not in dic:
                dic[num] = i
            else:
                return [dic[remain],i]
            
        # Time complexity: O(n)
        # Space complexity: O(n)
