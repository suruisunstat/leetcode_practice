class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        
        if n == 1:
            return '1'
        
        res_list = ['' for _ in range(n)]
        res_list[0] = "1"
        
        def say_next(s):
            res = ""
            i = 0
            while i < len(s):
                cur = s[i]
                cur_cnt = 1
                while i+1 < len(s) and s[i+1] == cur:
                    i = i + 1
                    cur_cnt = cur_cnt + 1
                res += str(cur_cnt)
                res += cur
                i = i + 1
            return res
        
        for i in range(n-1):
            res_list[i+1] = say_next(res_list[i])
        return res_list[-1]
    
    # Time: o(2^n)? can't say
    # Space: O(N)
