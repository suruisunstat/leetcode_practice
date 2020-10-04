class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        def lcp(strs, l, r):
            # base case
            if l == r:
                return strs[l]
            else:
                mid = l + (r - l) // 2
                lcpLeft = lcp(strs,l, mid)
                lcpRight = lcp(strs, mid+1, r)
                return combine_cp(lcpLeft,lcpRight)
        # no need to worry about corner cases like in binary search 
            
        
        def combine_cp(left, right):
            min_len = min(len(left), len(right))
            for i in range(min_len):
                if left[i] != right[i]:
                    return left[:i]
            return left[:min_len]
#         if strs == []:
#             return ""
        
#         for i in range(len(strs[0])):
#             cur = strs[0][i]
#             for j in range(1, len(strs)):
#                 if i == len(strs[j]) or strs[j][i] != cur:
#                     return strs[0][:i]
#         return strs[0]
        
    
    ## divide and conquer 
        if strs == []:
            return ""
        return lcp(strs, 0, len(strs) - 1)
        
        
    
        
#         res = ""
#         idx = 0
        
#         if strs == []:
#             return res
        
#         min_length = min([len(s) for s in strs])
        
#         while idx < min_length:
#             if len(set([s[idx] for s in strs])) == 1:
#                 res = res + strs[0][idx]
#                 idx = idx + 1
#             else:
#                 break
        
            
#         return res

    # Time: O(N * M)
    # Space: O(N)
                
            
