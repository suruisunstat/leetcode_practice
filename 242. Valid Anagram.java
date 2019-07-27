class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] counter = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        
        for(int count: counter){
            if (count != 0)
                return false;
        }
        return true;
        
        // char[] charS = s.toCharArray();
        // Arrays.sort(charS);
        // char[] charT = t.toCharArray();
        // Arrays.sort(charT);
        // return Arrays.equals(charS,charT);
        // String snew = String.valueOf(charS);
        // String tnew = String.valueOf(charT);
        // return snew.equals(tnew);
    }
}
