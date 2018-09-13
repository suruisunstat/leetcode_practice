/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
Input: ["flower","flow","flight"]
Output: "fl"
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean hasNext = true;
        if (strs.length == 0) {
            return "";
        }
    String s1 = strs[0];
    int j = 0;
    
    // find the maximum length
    int minLength = s1.length(); // 4
    for (int k = 1; k < strs.length; k++) {
      if (strs[k].length() < minLength) {
        minLength = strs[k].length();
      }
    }
    
    while (hasNext && j < minLength) {
      for(int i = 1; i < strs.length; i++) {
        if (strs[i].charAt(j) != s1.charAt(j)) {
          return strs[i].substring(0, j);
        }
        else {
          continue;
          }
      }
      j++;
    }
    return s1.substring(0,minLength);
    }
}
