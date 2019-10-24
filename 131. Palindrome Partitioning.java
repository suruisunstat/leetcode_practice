class Solution {
   public List<List<String>> partition(String s) {
       ArrayList<String> item = new ArrayList<String>();
       List<List<String>> res = new ArrayList<>();
       if (s.length() == 0 || s == null) return res;
       dfs(s,0,item,res);
       return res;
   }
   
   public void dfs(String s, int start, ArrayList<String> item, List<List<String>> res) {
       if (start == s.length()) {
           res.add(new ArrayList<String>(item));
           return;
       }
       
       for (int i = start; i < s.length(); i++) {
           String str = s.substring(start,i+1);
           if (isPalindrome(str)) {
               item.add(str);
               dfs(s,i+1,item,res);
               item.remove(item.size() - 1);
           }
       }
       
   }
    
   public boolean isPalindrome(String s) {
       int lo = 0, hi = s.length() - 1;
       while (lo < hi) {
           if (s.charAt(lo) != s.charAt(hi)) {
               return false;
           }
           lo++;
           hi--;
       }
       return true;
   }

}
