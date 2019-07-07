class Solution {
    public int numMatchingSubseq(String S, String[] words) {
        int res = 0;
        Map <Character, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            if (!map.containsKey(S.charAt(i))) {
                map.put(S.charAt(i), new ArrayList<Integer>());
            }
            map.get(S.charAt(i)).add(i);
        }
        
        for (int i = 0; i < words.length; i++) {
            int d = 0;
            int k = -1;
            for (d = 0; d < words[i].length(); d++) {
                if (!map.containsKey(words[i].charAt(d)))
                    break;
                else {
                    ArrayList<Integer> l = map.get(words[i].charAt(d));
                    boolean has = false;
                    for(int m = 0; m < l.size(); m++)
                        if (k < l.get(m)) {
                            k = l.get(m);
                            has = true;
                            break;
                        }
                    if (!has) break;        
                }
            }
            if (d == words[i].length()) res++;
        }
        return res;
    }
}


### Python

## first code TLE, second code almost TLE but still pass
class Solution(object):
    def numMatchingSubseq(self, S, words):
        """
        :type S: str
        :type words: List[str]
        :rtype: int
        """
        dict = {}
        for i,s in enumerate(S):
            if s not in dict:
                dict[s] = [i]
            else:
                dict[s].append(i)

        res = 0
        for word in words:
            d = 0
            k = -1
            for d in range(len(word)):
                if word[d] not in dict:
                    break
                else:
                    l = dict[word[d]]
                    has = False
                    for m in range(len(l)):
                        if l[m] > k:
                            k = l[m]
                            has = True
                            break
                    if not has:
                        break
            #print(d)
            if d == len(word) - 1 and has:
                res += 1
        return res
        
        
#         def isSubsequence(s,t):
#             if len(s) == 0:
#                 return True
#             idx = 0
#             for tt in t:
#                 if s[idx] == tt:
#                     idx += 1
#                 if idx == len(s):
#                     return True
#             return False
        
#         count = 0
#         passSet = set()
#         failSet = set()
#         for word in words:
#             if word in passSet or word in failSet:
#                 if word in passSet:
#                     count += 1
#                 continue
            
#             if isSubsequence(word,S):
#                 count += 1
#                 passSet.add(word)
#             else:
#                 failSet.add(word)
#         return count
