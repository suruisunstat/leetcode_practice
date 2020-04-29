class Solution(object):
    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 1:
            return nums[0]
        
        if len(nums) == 2:
            return nums[0] if nums[0] < nums[1] else nums[1]
        
        l = 0
        r = len(nums) - 1
        
        while nums[l] == nums[r] and l < r:
            l = l + 1
            
        if nums[l] <= nums[r]:
            return nums[l] # (1,1,1,2,1) or (1,1,1,1,1) 
        
        while l < r:
            mid = l + (r - l) // 2
            if nums[mid] > nums[mid + 1]:
                return nums[mid + 1]
            if nums[l] < nums[r]: # why? good example [10, 10, 10, 10, 10, 10, 10, -10, -9, -9, -9, -9]
                return nums[l]
            elif nums[mid] < nums[l]:
                r = mid
            elif nums[mid] > nums[l]:  
                l = mid + 1 
            else: # nums[mid] == nums[l]
                while nums[mid] == nums[l] and l < r:
                    l = l + 1 # or l = mid + 1 
         
        return nums[l]
                    
        # Time: O(logn) to 0(n)
        # Space: O(1)
        # [10, 10, 10, 10, 10, 10, 10, -10, -9, -9, -9, -9]
        
        
