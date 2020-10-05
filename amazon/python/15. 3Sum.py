class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        nums.sort()
        for i in range(len(nums)):
            if nums[i] > 0:
                break
            if i == 0 or nums[i] != nums[i-1]: # this is important condition 
                self.twoSumII(nums, i, res)
                
        return res
        
        
    
    def twoSumII(self, nums, i, res):
        lo = i + 1
        hi = len(nums) - 1
        while lo < hi:
            if nums[lo] + nums[hi] < - nums[i]:
                lo = lo + 1
            elif nums[lo] + nums[hi] > - nums[i]:
                hi = hi - 1
            else:
                res.append([nums[i], nums[lo], nums[hi]])
                lo = lo + 1
                hi = hi - 1
                while lo < hi and nums[lo] == nums[lo - 1]: # this condition easy to forget... 
                    lo = lo + 1
    
    # Time: O(n^2)
    # Space: O(logn) depending on the sort algorithm 
#         res = []
        
#         nums.sort()
#         print(nums)
        
#         for i in range(len(nums)):
#             if nums[i] > 0:
#                 break
#             if i == 0 or nums[i-1] != nums[i]:
#                 self.twoSum(nums, i, res)
#                 print(i,res)
#         return res
    
#     def twoSum(self, nums, i, res):
#         seen = set() # reset the seen set each time ...
#         j = i + 1  
#         while j < len(nums):
#             complement = -nums[i] - nums[j]
#             print(i, j, complement)
#             if complement in seen:
#                 #print(seen)
#                 res.append([nums[i], nums[j], complement])
#                 while j + 1 < len(nums) and nums[j] == nums[j+1]:
#                     j += 1
#             seen.add(nums[j])
#             print(seen)
#             j += 1 
                    
                
                

                
                
