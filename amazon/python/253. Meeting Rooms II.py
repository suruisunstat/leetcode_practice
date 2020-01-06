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

    class Solution(object):
    def minMeetingRooms(self, intervals):
        intervals_start = [i[0] for i in intervals]
        intervals_start = sorted(intervals_start)
        intervals_end = [i[1] for i in intervals]
        intervals_end = sorted(intervals_end)
        
        j = 0
        num_rooms = 0
        
        for i in range(len(intervals_start)):
            if intervals_start[i] < intervals_end[j]:
                num_rooms = num_rooms + 1
            else:
                j = j + 1
        
        return num_rooms
