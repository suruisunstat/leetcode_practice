class Solution {
    public String alphabetBoardPath(String target) {
        if (target.length() == 0) return "";
        char[] targetS = target.toCharArray();
        StringBuilder sb = new StringBuilder();
        Character start = 'a';
        for (char s : targetS) {
            String temp = move(start,s);
            sb.append(temp);
            start = s;
        }
        String res = sb.toString();
        return res;
    }
    
    public String move(Character first, Character second) {
        // 'a' to 'g' : !dr!
        // 'b' to 'h' : r!dr!
        // move up down first, then move. left right
        StringBuilder sub = new StringBuilder();
        int r1 = (first - 'a')/5;
        int c1 = (first - 'a')%5;
        int r2 = (second - 'a')/5;
        int c2 = (second - 'a')%5;
        
        
        // move up => left => right => down
        if (r1 > r2) {
            for (int i = r1; i > r2; i--) {sub.append("U");}
        }
        if (c1 > c2) {
            for (int i = c1; i > c2; i--) {sub.append("L");}
        }
        if (c1 < c2) {
            for (int i = c1; i < c2; i++) {sub.append("R");}
        }
        if (r1 < r2) {
            for (int i = r1; i < r2; i++) {sub.append("D");}
        }
        sub.append("!");
        String onestepS = sub.toString();
        return onestepS;
    }
}

// Time: O(target.length)
