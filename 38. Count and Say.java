class Solution {
    public String countAndSay(int n) {
        if (n < 1) return("");
        String str = "1";
        for (int i = 1; i < n; i++) {
            int count = 0;
            StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < str.length(); j++) {
                count++;
                if ((j + 1 < str.length()) && (str.charAt(j) != str.charAt(j+1)) ) {
                    sb = sb.append(count).append(str.charAt(j));
                    count = 0;
                }
                else if (j+1 == str.length()) {
                    sb = sb.append(count).append(str.charAt(j));
                }
            }
            str = sb.toString();
            
        }
        return(str);
    }
    
}

// Time:O(n * length(str))
// Space: O(1)
