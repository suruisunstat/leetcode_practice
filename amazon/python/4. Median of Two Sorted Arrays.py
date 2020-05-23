class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        if len(nums1) > len(nums2):
            return self.findMedianSortedArrays(nums2, nums1)
        
        m = len(nums1)
        n = len(nums2)
        
        # m <= n  always holds, so do a binary search on nums1 (smaller size array)
        
        l = 0 
        h = m
        
        while l <= h: # split point can start from 0 and end with m. (Meaning the number of elements in the left array for nums1)
            partitionX = l + (h - l)/ 2 # if l == h, partitonX = l is still valid checking 
            partitionY = (m + n + 1)/ 2 - partitionX
            max_Xleft = -float("Inf") if partitionX == 0 else nums1[partitionX - 1]
            min_Xright = float("Inf") if partitionX == m else nums1[partitionX]
            max_Yleft = -float("Inf") if partitionY == 0 else nums2[partitionY - 1]
            min_Yright = float("Inf") if partitionY == n else nums2[partitionY]
            
            if max_Xleft <= min_Yright and max_Yleft <= min_Xright:
                # find the case
                if (m + n) % 2 == 0: # if even number, then average of two medium values
                    return (max(max_Xleft, max_Yleft) + min(min_Xright, min_Yright)) / 2.0
                else: # odd number, find the max value from left side
                    return max(max_Xleft, max_Yleft)
            elif max_Xleft > min_Yright: # the left part of X is too large, so should search on the lefter side 
                h = partitionX - 1
            else:
                l = partitionX + 1
                
        return -float("Inf") # did not find the median if not sorted
    
    
    
    ## Time: O(log(min(m,n)))
    ## Space: O(1)
                    
            
            
            
