class Solution(object):
    def canJump(self, nums):
        lastPos = len(nums) - 1
        for i in range(len(nums) - 2, -1, -1):
            far_pos = min(i + nums[i], len(nums) -1)
            if far_pos >= lastPos:
                lastPos = i
        return lastPos == 0

    # Time: O(n)
    # space: O(1)
    
#     def canJumpFromPosition(self, position, nums, memo):
#         if memo[position] != 'unknown':
#             if memo[position] == 'good':
#                 return True
#             else:
#                 return False
#         far_position = min(position + nums[position], len(nums) - 1)
#         for nextPos in range(position+1, far_position+1):
#             if self.canJumpFromPosition(nextPos, nums, memo):
#                 memo[position] = 'good'
#                 return True
#         memo[position] = 'bad'
#         return False
    
#     def canJump(self, nums):
#         memo = ['unknown' for _ in range(len(nums))]
#         memo[len(memo) - 1] = 'good'
#         return self.canJumpFromPosition(0, nums, memo)
    
    
    # Time: O(n)
    # Space: O(1)
#     def canJump(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: bool
#         """
#         return self.canJumpFromPosition(0, nums)
    
    
#     def canJumpFromPosition(self, position, nums):
#         if position == len(nums) - 1:
#             return True
#         far_position = min(position + nums[position], len(nums) - 1)
#         for next_position in range(far_position, position, -1):
#             if self.canJumpFromPosition(next_position, nums):
#                 return True
#         return False
    
    ## Time: O(2^n)
    ## Space: O(n)
    
