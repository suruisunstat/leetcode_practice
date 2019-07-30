public class Solution {
    private List<String> res = new ArrayList<>();
    String cur;
    public List<String> restoreIpAddresses(String s) {
        backtract(s,new ArrayList<>());
        return res;
    }

    public void backtract(String s, List<String> temp) {
        if (temp.size() == 4) {
            //System.out.println(Arrays.toString(temp.toArray()));
            //System.out.println(s);
            if (s.length() == 0) { //  if (count == s.length())
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < temp.size(); j++) {
                    sb.append(temp.get(j));
                    sb.append(".");
                }
                String resStr = sb.toString();
                resStr = resStr.substring(0,resStr.length()-1);
                res.add(resStr);
                return;
            }
            else return;

        }


        for(int i = 0; i < 3; i++) {
            if (i+1 <= s.length()) {
                cur = s.substring(0,i+1);
            }
            else {
                break;
            }
            if ((Integer.parseInt(cur) >= 0) && (Integer.parseInt(cur) <= 255)) {
                if ((cur.length() > 1) && (cur.charAt(0) == '0')) continue;
                else temp.add(cur);
                //count += cur.length();
            }
            else
                continue;


            backtract(s.substring(i+1,s.length()), temp);
            //count -= temp.get(temp.size()-1).length();
            //s += temp.get(temp.size()-1);
            temp.remove(temp.size() - 1);
//            if (i+1 <= s.length()) {
//                backtract(s.substring(i+1,s.length()), temp);
//                //count -= temp.get(temp.size()-1).length();
//                //s += temp.get(temp.size()-1);
//                temp.remove(temp.size() - 1);
//
//            }

        }


    }

    public static void main(String args[]) {
        Solution sol = new Solution();
        String s = "25525511135";
//        int i = 0;
//        String cur = s.substring(0,i+1);
//        System.out.println(cur);
        List<String> res = sol.restoreIpAddresses(s);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
        //System.out.println(res);
                //"/a/../../b/../c//.//";
        //String[] arrOfStr = path.split("/");
        //System.out.println("hello world");
        //System.out.println(res);
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
//        root.left.left = new TreeNode(2);
//        root.right.left = new TreeNode(2);
//        boolean res = sol.isSymmetric(root);
//        for (int i = 0; i < res.size(); i++) {
////            TreeNode temp = res.get(i);
////            System.out.println();
////        }



//        int[] temp = {};
//        System.out.println(temp.length);
//        //System.out.println(temp[0]);
//        //System.out.println(temp[-1]);
    }
}


