class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals = sorted(intervals, key = lambda x: x[0])
        new_interval_list = []
        
        for interval in intervals:
            if not new_interval_list or interval[0] > new_interval_list[-1][1]:
                new_interval_list.append(interval)
            else:
                new_interval_list[-1][1] = max(new_interval_list[-1][1], interval[1])
        
        return new_interval_list

        # i = 0
        # while i < len(intervals):
        #     cur_interval = intervals[i]
        #     while i + 1 < len(intervals) and intervals[i+1][0] <= cur_interval[1]:
        #         # merge
        #         finish_time = max(cur_interval[1], intervals[i+1][1])
        #         #start_time = min(cur_interval[0], intervals[i+1][0])
        #         cur_interval = [cur_interval[0], finish_time]
        #         i = i+ 1
        #     new_interval_list.append(cur_interval)
        #     i = i + 1
        # return new_interval_list
    
    
    # Time: O(nlogn)
    # Space: O(nlogn) for sort 
