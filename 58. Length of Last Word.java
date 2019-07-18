class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int i = s.length() - 1; 
        int count = 0;
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        for(; i>=0 && s.charAt(i) != ' '; i--,count++);
        return count;
    }
}
