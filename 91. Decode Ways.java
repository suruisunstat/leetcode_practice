class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') return 0;
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        // assume s has at least 3 characters
        for (int i = 2; i < dp.length; i++) {
            if (s.charAt(i-1) != '0') {
                dp[i] += dp[i-1];
            }
            int val = Integer.parseInt(s.substring(i-2,i));
            if (val >= 10 && val <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[s.length()];
    }
}

// dp[i] represent the number of possibilities for the first i characters in a string
// the length of dp is +1 of the size of string
// Time: O(n)
// Space: O(n)
