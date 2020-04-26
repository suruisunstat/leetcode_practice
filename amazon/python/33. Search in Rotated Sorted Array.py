class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
#         def find_rotate_index(left, right): # the length is at least 2 
#             if nums[left] < nums[right]:
#                 return 0
            
#             while left <= right:
#                 pivot = (left + right)//2
#                 if nums[pivot] > nums[pivot + 1]: # how do you know pivot will not overflow? 
#                     return pivot + 1
#                 else:
#                     if nums[pivot] < nums[left]:
#                         right = pivot - 1
#                     else:
#                         left = pivot + 1
                        
#         def search(left, right):
#             while left <= right:
#                 pivot = (left + right) // 2
#                 if nums[pivot] == target:
#                     return pivot
#                 else:
#                     if target < nums[pivot]:
#                         right = pivot - 1
#                     else:
#                         left = pivot + 1
#             return -1
       
#         n = len(nums)
        
#         if n == 0:
#             return -1
#         if n == 1:
#             return 0 if nums[0] == target else -1
        
#         rotate_index = find_rotate_index(0, n-1)
        
#         if nums[rotate_index] == target:
#             return rotate_index
#         if rotate_index == 0:
#             return search(0, n-1)
#         if target < nums[0]:
#             return search(rotate_index, n-1)
#         return search(0, rotate_index)
    
    #
        # method 2:
        start, end = 0, len(nums) - 1
        while start <= end:
            mid = start + (end - start) // 2
            if nums[mid] == target:
                return mid
            elif nums[mid] >= nums[start]: # from start to mid, it's increasing why do we have >= not > 
                if target >= nums[start] and target < nums[mid]: # why do we have >= 
                    end = mid - 1
                else: 
                    start = mid + 1
                    
                
            else: # nums[mid] < nums[start], the rotate_index is between start and mid
                if target > nums[mid] and target <= nums[end]:
                    start = mid + 1
                else:
                    end = mid - 1
        return -1
        
        # Time: O(logn)
        # Space: O(1)
        # When use left <= right and when use left < right, when use r = len(nums) and when r = len(nums) - 1? 我觉得是okay的 
                
        
