class Solution(object):
    def minEatingSpeed(self, piles, H):
        """
        :type piles: List[int]
        :type H: int
        :rtype: int
        """
        # if len(piles) = 0:
        #     return -1
        # [3,6,7,11]
        
        
        l = (sum(piles) - 1) // H  + 1 # 3
        r = max(piles) #  11
        
        
        # could be >= 3 and <= 11
        while l < r:
            mid = l + (r - l) // 2 # 7
            #print(l, r, mid)
            total_H = 0
            for i in range(len(piles)):
                temp_H = (piles[i]- 1) // mid  + 1# [3//7, 6//7, 7//7, 11//7] = [1,1,1,2]
                total_H = total_H + temp_H
            #if total_H == H: # total_H = 5
                #return mid
            #print(total_H)
            if total_H > H:
                l = mid + 1
            else:
                r = mid
        #print("===")
        #print(l,r)
                
        return l
    
    # Time: O(n) + o(log (r - l) * n)
    # Space: O(1)
