class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        int curr = 0;
        int n = needle.length();
        for(curr = 0; curr <= haystack.length() - n; curr++) {
            if (haystack.substring(curr, curr+n).equals(needle)) return curr;
        }
        return -1;
        
    }
}
