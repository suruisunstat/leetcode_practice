class Solution(object):
    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        
        l = 0
        r = len(nums) - 1
        
        if len(nums) == 1:
            return nums[0]
        
        if nums[0] < nums[len(nums) - 1]:
            return nums[0]
        
        while l < r: # <= r or < r both works
            mid = l + (r - l)//2
            if nums[mid] > nums[mid + 1]: # will it overflow? 
                return nums[mid + 1]
            elif nums[mid] > nums[l]: # from l to mid, it is increasing, so the value should be somewhere after mid
                l = mid + 1
            else:
                r = mid # mid can be the one 
        
        # print("come here")
        # return nums[r] #nums[l] and nums[r] both works, acctually if there is always an answer, it won't go here?  
    
    # Time: O(logn)
    # Space: O(1)
