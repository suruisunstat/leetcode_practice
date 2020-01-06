from collections import Counter
import heapq

class Solution(object):
    # def topKFrequent(self, words, k):
    #     """
    #     :type words: List[str]
    #     :type k: int
    #     :rtype: List[str]
    #     """
    #     ct = Counter(words) # O(n)
    #     keys = ct.keys()
    #     res = sorted(keys, key = lambda x: (-ct[x],x))
    #     res = res[:k]
    #     return res
    
    def topKFrequent(self, words, k):
        """
        :type words: List[str]
        :type k: int
        :rtype: List[str]
        """
        ct = Counter(words) # O(n)
        heap = [(-freq,word) for word,freq in ct.items()]
        heapq.heapify(heap)
        return [heapq.heappop(heap)[1] for _ in range(k)]
    
    # Time: O(nlogk) java o(n+klogn) for python
    # Space: O(n)
