class Solution(object):
    def compress(self, chars):
        """
        :type chars: List[str]
        :rtype: int
        """
        i, n = 0, len(chars)
        j = 0 # j is final length
        while i < n:
            cur_ch = chars[i]
            cur_cnt = 1
            while i+ 1 < n and chars[i+1] == cur_ch:
                cur_cnt += 1
                i = i + 1
            if cur_cnt > 1:
                chars[j] = cur_ch
                j = j + 1
                len1 = len(str(cur_cnt))
                chars[j:(j+len1)] = str(cur_cnt)
                # for k in range(len1):
                #     chars[j+k] = str(cur_cnt)[k]
                j = j + len1
            else:
                chars[j] = cur_ch
                j = j + 1
            i = i + 1
        return j
                
        # Time: O(n)
        # Space: O(1)
                
        
