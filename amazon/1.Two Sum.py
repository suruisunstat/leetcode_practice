class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        h = {}
        for i, num in enumerate(nums):
            remain = target - num
            if remain not in h:  ## "in" is 0(1)
                h[num] = i
            else:
                return [i,h[remain]]
