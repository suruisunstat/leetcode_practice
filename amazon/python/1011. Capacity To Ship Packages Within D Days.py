class Solution(object):
    def shipWithinDays(self, weights, D):
        """
        :type weights: List[int]
        :type D: int
        :rtype: int
        """
        
        # result should be less than the max weight and greater equal than max weight
        l, r = max(weights), sum(weights) # l = 10, r = 55, D = 5 (answer: 15)
        while l < r:
            mid = l + (r - l) // 2 # mid: 32
            # calculate total_date for level at mid, weights: [1,2,3,4,5,6,7,8,9,10]
            total_date = 0
            total_weight = 0
            for i in range(len(weights)):
                total_weight = total_weight + weights[i]
                if total_weight >= mid: # 28 + 8 = 36, on weights 8
                    total_date = total_date + 1 # 1 for [1,2,3,4,5,6,7] < 32
                    if total_weight == mid:
                        total_weight = 0
                    else: # total_weight > mid
                        total_weight = weights[i] # 8
            # if after adding last element the last bucket does not exceed the limit
            total_date += 1 # for [8,9,10] < 32 total_date = 2, all cases adding 1 no matter what
            
            if total_date > D:
                l = mid + 1
            else: # if total_date < D should be r = mid - 1, if total_date == D, should still search 
                r = mid
        
        return l
    
    # Time: O(nlogx)
    # Space: O(1)
            
                
        
