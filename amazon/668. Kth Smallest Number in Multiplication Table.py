class Solution(object):
    def findKthNumber(self, m, n, k):
        """
        :type m: int
        :type n: int
        :type k: int
        :rtype: int
        """
        # binary search
        def enough(x):
            count = 0
            for i in range(1, m+1):
                count += min(n, x//i)
            return count >= k
        
        lo, hi = 1, m * n
        while lo < hi:
            mi = lo + (hi - lo)/2
            if not enough(mi):
                lo = mi + 1
            else:
                hi = mi
        return lo 
    # Time: O(log(mn) * m)
    # Space: O(1)
        
#         heap = [(i,i) for i in range(1, m+1)]
#         heapq.heapify(heap)
        
#         for _ in range(k):
#             val, root = heapq.heappop(heap)
#             nxt = val + root
#             if nxt <= root * n:
#                 heapq.heappush(heap, (nxt, root))
        
#         return val 
    
    # Time: O(k * log(m)) / O(mnlog(m))
    
    
