class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        N = len(nums)
        pivot = 0
        for i in range(N-1,0,-1):
            if nums[i-1] < nums[i]:
                pivot = i
                break 
        if pivot == 0:
            return nums.sort()
        
        swap = N - 1
        while nums[pivot-1] > nums[swap]:
            swap = swap - 1

        nums[pivot-1], nums[swap] = nums[swap], nums[pivot-1]
        nums[pivot:] = sorted(nums[pivot:])
        return nums 

# Time: O(N)
# Space: O(1)
