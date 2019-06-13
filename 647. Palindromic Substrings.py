# solution 1:
class Solution(object):
    def countSubstrings(self, s):
        """
        :type s: str
        :rtype: int
        """
        ans = 0
        N = len(s)
        for i in range(2*N - 1):
            left = i/2
            right = left + i%2
            while left >= 0 and right < N and s[left] == s[right]:
                ans += 1
                left -= 1
                right += 1
        return ans
        
        
 # solution 2: DP
 def countSubstrings(self, s):
    if not s:
        return 0

    n = len(s)
    table = [[False for x in range(n)] for y in range(n)]
    count = 0

    # Every isolated char is a palindrome
    for i in range(n):
        table[i][i] = True
        count += 1

    # Check for a window of size 2
    for i in range(n-1):
        if s[i] == s[i+1]:
            table[i][i+1] = True
            count += 1

    # Check windows of size 3 and more
    for k in range(3, n+1):
        for i in range(n-k+1):
            j = i+k-1
            if table[i+1][j-1] and s[i] == s[j]:
                table[i][j] = True
                count += 1

    return count
