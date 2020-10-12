class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return 0
        i = 0
        for j in range(len(nums)):
            if nums[j] != nums[i]:
                i = i + 1
                nums[i] = nums[j]
                
                
        return i + 1 
    
    # input: [1,1,2,3,4,4,4] => [1,2,3,4,4,4,4]
    
    # Time: O(n)
    # Space: O(1)
