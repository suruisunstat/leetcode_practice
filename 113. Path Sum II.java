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
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return res;
        dfs(root,root,0,sum);
        return res;
    }
    
    public void dfs(TreeNode root, TreeNode parent, int curSum, int sum) {
        System.out.println(Arrays.toString(temp.toArray()));
        if (curSum == sum && root == null && parent.left == null && parent.right == null) {
            res.add(new ArrayList<>(temp));
            //temp = new ArrayList<>();
            return;
        }
        
        if (root == null) {
            // curSum = curSum - temp.get(temp.size()-1);
            //temp.remove(temp.size() - 1);
            return;
        }
        
        temp.add(root.val);
        dfs(root.left,root,curSum + root.val, sum); // the value of temp changed after this dfs left
        if (!(root != null && root.left == null && root.right == null)) {
            // do nothing, skip
            dfs(root.right,root,curSum + root.val, sum);
        }
        temp.remove(temp.size() - 1);
        
    }
}
