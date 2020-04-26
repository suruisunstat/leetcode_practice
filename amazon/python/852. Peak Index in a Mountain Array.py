class Solution(object):
    def peakIndexInMountainArray(self, A):
        """
        :type A: List[int]
        :rtype: int
        """
        l = 0
        r = len(A) - 1
        while l <= r:
            mid = l + (r-l)//2
            if A[mid] > A[mid - 1] and A[mid] > A[mid + 1]:
                return mid
            elif A[mid] > A[mid - 1] and A[mid] < A[mid + 1]:
                # ascending
                l = mid + 1
            elif A[mid] < A[mid - 1] and A[mid] > A[mid + 1]:
                # descending 
                r = mid - 1
                # boundings 
        
        # time: O(logn)
        # space: O(1)
        # mid cannot be 0 or last because the definition 
