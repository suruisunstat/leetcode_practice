# class Solution(object):
#     def sort_log(self, log):
#         log_list = log.split(" ")
#         return ' '.join(log_list[1:] + log_list[:1])
    
#     def reorderLogFiles(self, logs):
#         """
#         :type logs: List[str]
#         :rtype: List[str]
#         """
#         dig_list = []
#         let_list = []
#         for log in logs:
#             log_list = log.split(" ")
#             if log_list[1].isdigit(): # digit
#                 dig_list.append(log) # original order
#             else:
#                 let_list.append(log)

#         let_list = sorted(let_list, key = self.sort_log)
#         result = let_list + dig_list
#         return result
    
    
class Solution(object):
    def reorderLogFiles(self, logs):
        def f(log):
            id_, rest = log.split(" ",1)
            return (0,rest, id_) if rest[0].isalpha() else (1,)
        return sorted(logs, key = f)

# Time: O(nlogn)
# space: O(n)
