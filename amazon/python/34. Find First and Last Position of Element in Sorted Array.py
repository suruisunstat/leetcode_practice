class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        if len(nums) == 0:
            return [-1,-1]
        
        l = 0
        r = len(nums)
        
        res = [-1, -1]
        
        while l < r:
            mid = l + (r-l)//2
            if target > nums[mid]:
                l = mid + 1
            else:
                r = mid
        
        if r < len(nums) and r >= 0 and nums[r] == target: 
            res[0] = r
        else:
            return [-1,-1]
        
        l = 0
        r = len(nums)
        
        while l < r:
            mid = l + (r-l)//2
            if target >= nums[mid]:
                l = mid + 1
            else:
                r = mid
                
        res[1] = r - 1
        
        return res
    
    ## Time: O(logn)
    ## Space: O(1)
