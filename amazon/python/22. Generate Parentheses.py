class Solution(object):
    def generateParenthesis(self, n):
#         """
#         :type n: int
#         :rtype: List[str]
#         """
        ans = []
        def backtrack(S = "", left = 0, right = 0):
            if len(S) == 2 * n:
                ans.append(S)
                return
            if left < n:
                backtrack(S + "(", left + 1, right)
            if right < left:
                backtrack(S + ")", left, right + 1)
        
        backtrack()
        return ans

#         ans = []
#         def backtrack(S = '', left = 0, right = 0):
#             if len(S) == 2 * n:
#                 ans.append(S)
#                 return
#             if left < n:
#                 backtrack(S + "(", left + 1, right)
#             if right < left:
#                 backtrack(S + ")", left, right + 1)
        
#         backtrack()
#         return ans
        # parantheses = [[] for i in range(n+1)]
        # parantheses[0] += '',
        # for i in range(1,n+1):
        #     for j,k in zip(range(i), reversed(range(i))):
        #         for x in parantheses[j]:
        #             for y in parantheses[k]:
        #                 parantheses[i].append( '(' + x + ')' + y)
        # return parantheses[-1]
#         res_list = [[] for _ in range(n+1)]
#         #res_list = [[]] * (n+1) this doesn't work 
#         res_list[0].append('')
#         print(res_list)
        
#         for i in range(1, n+1):
#             for j, k in zip(range(i), reversed(range(i))):
#                 for x in res_list[j]:
#                     for y in res_list[k]:
#                         res_list[i].append('(' + x + ')' + y)
#             #print(res_list[i])
#         return res_list[-1]
