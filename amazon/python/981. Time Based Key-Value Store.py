class TimeMap(object):

    # use nested dictionary and one list to store timestamp
    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.dict = collections.defaultdict(list) # important 
        

    def set(self, key, value, timestamp):
        """
        :type key: str
        :type value: str
        :type timestamp: int
        :rtype: None
        """
        self.dict[key].append((timestamp, value))

    def get(self, key, timestamp):
        """
        :type key: str
        :type timestamp: int
        :rtype: str
        """
        #print(self.dict)
        
        # find first timestamp <= target_timestamp
        values = self.dict[key]
        if not values:
            return ""
        l = 0
        r = len(values)
        
        # this binary search will return the idx where first val >= timestamp 
        while l < r:
            mid = l + (r - l) // 2
            pre_time, value = values[mid]
            if timestamp > pre_time:
                l = mid + 1 
            else:
                r = mid 
        #print("r is: " + str(r))
        # check if self.timestamp_list is valid
        if r == 0:
            if values[r][0] == timestamp:
                return values[r][1]
            else:
                return ""
        elif r == len(values):
            return values[r-1][1]
        else:
            if values[r][0] == timestamp:
                return values[r][1]
            else:
                return values[r-1][1]
            
            
    
    # Time: O(logn)
    # Space: O(N)
            
            
        
        
        
        


# Your TimeMap object will be instantiated and called as such:
# obj = TimeMap()
# obj.set(key,value,timestamp)
# param_2 = obj.get(key,timestamp)
