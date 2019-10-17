class Solution {
    public String addBinary(String a, String b) {
        int lenA = a.length(); // a = '11' 2
        int lenB = b.length(); // b = '1' 1
        if (lenA > lenB) {
            for(int j = 0; j < lenA - lenB; j++) {
                b = "0" + b;
            }
            //b = "0".repeat(lenA - lenB) + b; 
        } else if (lenA < lenB) {
            for(int j = 0; j < lenB - lenA; j++) {
                a = "0" + a;
            }
            //a = "0".repeat(lenB - lenA) + a;
        }
        int maxLen = Math.max(lenA,lenB); // 2
        StringBuilder sb = new StringBuilder("");
        Boolean add_1 = false;
        System.out.println(a);
        System.out.println(b);
        for (int i = maxLen - 1; i >= 0; i--) {
            //int cur = (Integer.parseInt(a.charAt(i)) + Integer.parseInt(b.charAt(i))) % 2;
            if ((a.charAt(i) == '1') && (b.charAt(i) == '1')) {
                if (add_1) {
                    sb = sb.insert(0,"1");
                }
                else {
                   sb = sb.insert(0,"0"); 
                    add_1 = true;
                }
            } else if ( ((a.charAt(i) == '1') && (b.charAt(i) == '0')) || ((a.charAt(i) == '0') && (b.charAt(i) == '1')) ){
                if (add_1) {sb = sb.insert(0,"0");}
                else {sb = sb.insert(0,"1");}
            } else {
                if (add_1) {
                    sb = sb.insert(0,"1");
                    add_1 = false;
                }
                else {
                    sb = sb.insert(0,"0");
                    add_1 = false;
                }
            }
        }
        
        if (add_1) {sb = sb.insert(0,"1");}
        String res = sb.toString();
        return res;
        
    }
}

// time: O(maxlen)
// space: O(maxlen)
