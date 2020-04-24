class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if len(nums) == 0:
            return 0
        
        l = 0
        r = len(nums) - 1
        while l <= r:
            mid = l + (r - l)//2
            print(mid)
            if target == nums[mid]:
                return mid
            elif target > nums[mid]:
                l = mid + 1
            else:
                r = mid - 1 
        return l
        # Time: O(logn)
        # Space: O(1)
        
        # if l == len(nums): # insert 7 into [1,3,5,6] l = len(nums), r = len(nums) - 1
        #     return l 
        # if r == -1:
        #     return 0 # insert 0 into [1,3,5,6] l = 0, r= -1
        
