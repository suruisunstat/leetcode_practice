/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
//     private List<String> res = new ArrayList<>();
    
//     public List<String> binaryTreePaths(TreeNode root) {
//         dfs(root,new ArrayList<>());
//         return res;
//     }
    
//     public void dfs(TreeNode root, List<Integer> temp) {
//         if (root == null) return;
//         if (root.left == null && root.right == null) {
//             temp.add(root.val);
//             String tempS = this.lst2str(new ArrayList(temp));
//             res.add(tempS); // modify later
//             temp.remove(temp.size() - 1);
//             return;
//         }
//         temp.add(root.val);
//         dfs(root.left,temp);
//         dfs(root.right,temp);
//         temp.remove(temp.size() - 1);
//     }
    
//     private String lst2str(List<Integer> temp) {
//         // [1,2,5] => '1->2->5'
//         StringBuilder sb = new StringBuilder();
//         for(int i = 0; i < temp.size() - 1; i++) {
//             sb.append(temp.get(i));
//             sb.append("->");
//         }
//         sb.append(temp.get(temp.size()-1));
//         String s = sb.toString();
//         return s;
//     }
    public List<String> binaryTreePaths(TreeNode root){
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        dfs(root, res, "");
        return res;
    }
    
    public void dfs(TreeNode root, List<String> res, String s) {
        if (root.left == null && root.right == null) {
            s = s + root.val;
            res.add(s);
        } else if (root.left == null && root.right != null) {
            s = s + root.val + "->";
            dfs(root.right,res,s);
        } else if (root.left != null && root.right == null) {
            s = s + root.val + "->";
            dfs(root.left,res,s);
        } else {
            s = s + root.val + "->";
            dfs(root.left,res,s);
            dfs(root.right,res,s);
        }
    }
}
