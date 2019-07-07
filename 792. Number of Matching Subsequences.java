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
