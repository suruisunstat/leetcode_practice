class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        right = n - 1
        while right > 0 and nums[right] <= nums[right - 1]: # this can be equal
            right = right - 1
        
        swap_idx1 = right - 1
        if swap_idx1 == -1:
            nums[(swap_idx1+1):] = nums[(swap_idx1+1):][::-1]
            return
        
        swap_idx2 = swap_idx1 + 1
        i = swap_idx1 + 1
        while i < n:
            if nums[i] > nums[swap_idx1]: # this has to be larger 
                i = i + 1
            else:
                swap_idx2 = i - 1
                break
        
        if i == n:
            swap_idx2 = n - 1
        
        nums[swap_idx1], nums[swap_idx2] = nums[swap_idx2], nums[swap_idx1]
        
        # reverse the part to the right of swap_idx1
        nums[(swap_idx1+1):] = nums[(swap_idx1+1):][::-1]
        return
    
    # Time: O(n)
    # Space: O(1)
        
        
        
