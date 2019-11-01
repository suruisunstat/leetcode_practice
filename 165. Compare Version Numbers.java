class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        // System.out.println("s1 length");
        // System.out.println(s1.length);
        // System.out.println("s2 length");
        // System.out.println(s2.length);
        
        // for(int i = 0; i < s1.length; i++) {
        //     System.out.println(s1[i]);
        // } 
        // for(int i = 0; i < s2.length; i++) {
        //     System.out.println(s2[i]);
        // } 
        
        int maxLen = Math.max(s1.length, s2.length);
        //System.out.println(maxLen);
        // if (s1.length < maxLen) {
        //     for(int i = s1.length; i < maxLen; i++) {
        //         s1
        //     }
        // }
        String[] s1_n = new String[maxLen];
        String[] s2_n = new String[maxLen];
        
        for(int i = 0; i < maxLen; i++) {
            if (i < s1.length) {
                s1_n[i] = s1[i];
            } else {
                s1_n[i] = "0";
            }
            
            if (i < s2.length) {
                s2_n[i] = s2[i];
            } else {
                s2_n[i] = "0";
            }
            
        }
        
        
        for(int i = 0; i < maxLen; i++) {
            if (Integer.parseInt(s1_n[i]) > Integer.parseInt(s2_n[i])) {
                return 1;
            } else if (Integer.parseInt(s1_n[i]) < Integer.parseInt(s2_n[i])) {
                return -1;
            }
        }
        
        return 0;
    }
}

// Time: O(n)
