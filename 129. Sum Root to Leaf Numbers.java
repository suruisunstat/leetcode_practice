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
    private List<List<Integer>> res = new ArrayList<>();
    //private List<Integer> temp = new ArrayList<>();
    private int sum = 0;
    
    public int sumNumbers(TreeNode root) {
        dfs(root, new ArrayList<>());
        return sum;
    }
    
    public int lst2int(List<Integer> path) {
        // [1,2,9] -> 129
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < path.size(); i++) {
            int cur = path.get(i);
            sb.append(Integer.toString(cur));
        }
        String s = sb.toString();
        return Integer.parseInt(s);
    }
    
    // dfs ,backtracking
    public void dfs(TreeNode root, List<Integer> temp) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            temp.add(root.val);
            List<Integer> tempCp = new ArrayList<>(temp);
            int val = lst2int(tempCp);
            //res.add(val);
            sum += val;
            temp.remove(temp.size() - 1);
            return;
        }
        temp.add(root.val);
        dfs(root.left, temp);
        dfs(root.right, temp);
        temp.remove(temp.size() - 1);
    }
}

// Time: dfs + for each element in each path
