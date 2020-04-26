class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: bool
        """
        if len(nums) == 0:
            return False
        if len(nums) == 1:
            return target == nums[0]
        
        l = 0
        r = len(nums) - 1
        while l <= r:
            mid = l + (r - l)//2
            if nums[mid] == target:
                return True
            elif nums[mid] == nums[l]:
                l = l + 1
            elif nums[mid] > nums[l]:
                if target >= nums[l] and target < nums[mid]:
                    r = mid - 1
                else:
                    l = mid + 1
            else: # nums[mid] < nums[l]
                if target > nums[mid] and target <= nums[r]:
                    l = mid + 1
                else:
                    r = mid - 1
                    
        return False
                
    
    # Time: o(LOGN) => o(N)
    # Space: O(1)
