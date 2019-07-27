class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> mapping = new HashMap<>();
        for (String s: strs) {
            char[] charS = s.toCharArray();
            Arrays.sort(charS);
            String newS = String.valueOf(charS);
            if (!mapping.containsKey(newS)) {
                mapping.put(newS, new ArrayList<String>());  
            }
            mapping.get(newS).add(s);
        }
        
        // convert hashmap to List of list of strings
        for (List<String> slist : mapping.values()) {
            res.add(new ArrayList<>(slist));
        }
        return res;
    }
}

//Time: O(k*nlogn)
