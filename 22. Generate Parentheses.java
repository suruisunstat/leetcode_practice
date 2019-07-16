class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtract(res,"",0,0,n);
        //generateAll(new char[2*n],0,res);
        return res;
    }
    
    public void backtract(List<String> ans, String cur, int open, int close, int max) {
        if (cur.length() == 2 * max) {
            ans.add(cur);
        }
        else {
            if (open < max) {
                backtract(ans,cur + "(", open + 1, close, max);
            }
            if (close < open) {
                backtract(ans, cur + ")", open, close+1, max);
            }
        }

    }
    
//     public void generateAll(char[] current,int pos, List<String> result) {
//         if (current.length == pos) {
//             if (isvalid(current)) {
//                 result.add(new String(current));
//             }
//         }
//         else {
//             current[pos] = '(';
//             generateAll(current,pos+1,result);
//             current[pos] = ')';
//             generateAll(current,pos+1,result);
//         }
//     }
    
//     public boolean isvalid(char[] s) {
//         int balance = 0;
//         for(char c : s) {
//             if (c == '(') 
//                 balance++;
//             else
//                 balance--;
//             if (balance < 0)
//                 return false;
//         }
//         return (balance == 0);
//     }
}
