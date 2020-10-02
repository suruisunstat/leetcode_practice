class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
#         max_area = 0
#         for i in range(len(height)):
#             for j in range(i+1, len(height)):
#                 cur_area = min(height[i], height[j]) * (j - i)
#                 if cur_area > max_area:
#                     max_area = cur_area
        
#         return max_area

    # two pointers solution:
        l, r = 0, len(height) - 1
        max_area = 0
        
        while l < r:
            cur_area = min(height[l],height[r]) * (r - l)
            if cur_area > max_area:
                max_area = cur_area
            
            if height[l] <= height[r]:
                l = l + 1
            else:
                r = r - 1
        
        return max_area
    
    # Time: O(n)
    # Space: O(1)
            
    
    # Time: O(n^2)
    # Space: O(1)
