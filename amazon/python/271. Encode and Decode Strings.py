class Codec:

    def encode(self, strs):
        """Encodes a list of strings to a single string.
        
        :type strs: List[str]
        :rtype: str
        """
        res = ""
        for s in strs:
            cur_len_str = str(len(s))
            res += '0' * (4 - len(cur_len_str))
            res += cur_len_str
            res += s
        
        return res
            
#         if len(strs) == 0:
#             return unichr(258)
        
#         return unichr(257).join(x.encode('utf-8') for x in strs)


    def decode(self, s):
        """Decodes a single string to a list of strings.
        
        :type s: str
        :rtype: List[str]
        """
        i = 0
        n = len(s)
        res_list = []
        while i < n:
            cur_len = int(s[i:(i+4)])
            i = i + 4
            res_list.append(s[i:(i+cur_len)])
            i = i + cur_len
        
        return res_list
            
            
        # if s == unichr(258):
        #     return []
        # return s.split(unichr(257))
    # Time: O(n)
    # Space: O(1) O(n)

# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.decode(codec.encode(strs))
