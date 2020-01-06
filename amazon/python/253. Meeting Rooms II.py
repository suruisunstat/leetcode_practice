import heapq

class Solution(object):
    def minMeetingRooms(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: int
        """
        # [[0, 30],[5, 10],[15, 20]]
        
        if len(intervals) == 0:
            return 0
        
        intervals = sorted(intervals, key = lambda x: x[0])
        free_rooms = []
        heapq.heappush(free_rooms,intervals[0][1])
        
        for i in range(1,len(intervals)):
            if free_rooms[0] <= intervals[i][0]:
                heapq.heappop(free_rooms)
            heapq.heappush(free_rooms, intervals[i][1])
            
        return len(free_rooms)

    
    ## Time: O(nlogn)
    ## Space: O(n)
