class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        res = []

        def backtrack(remain, comb, start):
            if remain == 0:
                res.append(list(comb))
                return
            elif remain < 0:
                return
            for i in range(start, len(candidates)):
                #comb.append(candidates[i])
                #print(remain - candidates[i], comb, i)
                backtrack(remain - candidates[i], comb + [candidates[i]], i)
                #comb.pop()
        backtrack(target, [], 0)
        return res
    
    # Time:
    # Space:
    
    
            #res_set = set()
        
        #candidates = sorted(candidates)
        
#         def backtrack(cur_sum, cur_cand, start):
#             if cur_sum == target:
#                 #print("here")
#                 # if tuple(sorted(cur_cand)) not in res_set:
#                 #     res_set.add(tuple(sorted(cur_cand)))
#                 res.append(cur_cand)  
#                 return 0
#             elif cur_sum > target:
#                 return 1
#             else:
#                 for i in range(start, len(candidates)):
#                     print(cur_sum + candidates[i], cur_cand+[candidates[i]], start, i, start + i)
#                     cur_res = backtrack(cur_sum + candidates[i], cur_cand+[candidates[i]], start + i)
#                     if cur_res == 0 or cur_res == 1:
#                         break
                        
#                     # cur_sum = cur_sum - candidates[i]
#                     # cur_cand = cur_cand[:-1]
            
#         backtrack(0, [], 0)
        
#         return res
        

                    
                    
                
