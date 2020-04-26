class Solution(object):
    def findPeakElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return -1
        if len(nums) == 1:
            return 0
        if len(nums) == 2:
            return 0 if nums[0] > nums[1] else 1
        
        if nums[0] > nums[1]:
            return 0
        
        if nums[len(nums) -1] > nums[len(nums) - 2]:
            return len(nums) - 1
        
        l = 0
        r = len(nums) - 1 # len(nums) >= 3
        while l <= r: # 4 cases 
            mid = l + (r-l)//2
            if nums[mid] > nums[mid - 1] and nums[mid] > nums[mid + 1]:
                return mid
            elif nums[mid] > nums[mid - 1] and nums[mid] < nums[mid + 1]:
                # ascending
                l = mid + 1
            elif nums[mid] < nums[mid - 1] and nums[mid] > nums[mid + 1]:
                # descending 
                r = mid - 1
            else: # at the valley
                l = l + 1
                # boundings 
        return -1
