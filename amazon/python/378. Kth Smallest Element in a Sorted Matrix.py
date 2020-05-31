import heapq

class Solution(object):
    def kthSmallest(self, matrix, k):
        """
        :type matrix: List[List[int]]
        :type k: int
        :rtype: int
        """
        N = len(matrix)
        
        minHeap = []
        for r in range(min(k,N)):
            minHeap.append((matrix[r][0], r, 0))
            
        heapq.heapify(minHeap)
        
        while k:
            element,r,c = heapq.heappop(minHeap)
            if c < N - 1:
                heapq.heappush(minHeap, (matrix[r][c+1], r, c+1))
            
            k -= 1
        
        return element 
    
    # X = min(N,K)
    # Time: O(X + Klog(X))
    # Space: O(X)
