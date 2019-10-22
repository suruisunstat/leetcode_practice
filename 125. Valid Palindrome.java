class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        //s = s.replaceAll("\\s","");
        int lo = 0, hi = s.length() - 1;
        while (lo < hi) {
            // System.out.println(s.charAt(lo));
            // System.out.println(s.charAt(hi));
            // System.out.println(Character.isDigit(s.charAt(lo)));
            // System.out.println(Character.isLetter(s.charAt(lo)));
            // System.out.println(Character.isDigit(s.charAt(hi)));
            // System.out.println(Character.isLetter(s.charAt(hi)));
            if (!Character.isDigit(s.charAt(lo)) && !Character.isLetter(s.charAt(lo))) {
                lo++;
                continue;
            }
            if (!Character.isDigit(s.charAt(hi)) && !Character.isLetter(s.charAt(hi))) {
                hi--;  
                continue;
            }
            if (Character.toLowerCase(s.charAt(lo)) != Character.toLowerCase(s.charAt(hi))) {return false;}
            else {
                lo++;
                hi--;
            }
        }
        return true;
    }
}

// time: O(n)

