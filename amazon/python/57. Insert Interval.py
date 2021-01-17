class Solution(object):
    def insert(self, intervals, newInterval):
        """
        :type intervals: List[List[int]]
        :type newInterval: List[int]
        :rtype: List[List[int]]
        """
        l1 = len(intervals)
        merged = []
        if intervals == []:
            merged.append(newInterval)
            return merged
        
        for idx, interval in enumerate(intervals):
            if interval[0] > newInterval[0]:
                intervals.insert(idx, newInterval)
                break
                # find start, then while loop to merge 
        
        if len(intervals) == l1:
            intervals.insert(l1,newInterval)
        
        
        
        
        for interval in intervals:
            if not merged or interval[0] > merged[-1][1]:
                merged.append(interval)
            else:
                merged[-1][1] = max(merged[-1][1], interval[1]) 
        return merged
    
    # Time: O(n)
    # Space: O(n)
            
            
            
        
        
                
