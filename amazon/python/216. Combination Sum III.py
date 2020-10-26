class Solution(object):
    def combinationSum3(self, k, n):
        """
        :type k: int
        :type n: int
        :rtype: List[List[int]]
        """
        
        res = []
        
        def backtrack(remain, comb, start):
            if len(comb) == k:
                if remain == 0:
                    res.append(list(comb))
                    return
                else:
                    return
            if remain < 0:
                return
            for i in range(start, 10): # 10 is not included, but 9 is 
                comb.append(i)
                backtrack(remain - i, comb, i+1)
                comb.pop()
        
        backtrack(n, [], 1)
        return res
    
    # Time:O(C(9,k))
    # Space: O(k)
