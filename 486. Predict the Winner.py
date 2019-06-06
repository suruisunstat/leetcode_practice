## method1: recursion O(2^n) time
class Solution(object):
    def PredictTheWinner(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        return self.winner(nums, 0, len(nums) - 1, 1) >= 0

    def winner(self, nums, s, e, turn):
        if s == e:
            return turn * nums[s]
        a = turn * nums[s] + self.winner(nums, s+1, e, -turn)
        b = turn * nums[e] + self.winner(nums, s, e - 1, -turn)
        return turn * max(turn * a, turn * b)


sol = Solution()
nums = [1, 5, 233, 7]
res = sol.PredictTheWinner(nums)
print(res)


## method2: O(n^2) time 

class Solution(object):
    def PredictTheWinner(self,nums):
        dp = [[0] * len(nums)] * len(nums)
        for s in range(len(nums)-1,-1,-1):
            dp[s][s] = nums[s]
            for e in range(s+1,len(nums)):
                a = nums[s] - dp[s+1][e]
                b = nums[e] - dp[s][e-1]
                dp[s][e] = max(a,b)
        return dp[0][len(nums)-1] >= 0
