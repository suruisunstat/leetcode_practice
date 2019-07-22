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
//     private List<List<Integer>> res;
    
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> res = new ArrayList<>();
//         int ht = height(root);
//         for (int i = 0; i < ht; i++) {
//             List<Integer> temp = rec(root,i, new ArrayList<Integer>());
//             res.add(new ArrayList<>(temp));
//         }
//         return res;
//     }
    
//     public List<Integer> rec(TreeNode root, int level, List<Integer> temp) {
//         //List<Integer> temp = new ArrayList<>();
//         if (root == null) return temp;
//         if (level == 0) {
//             temp.add(root.val);
//             return temp;
//         };
//         rec(root.left, level - 1, temp);
//         rec(root.right, level - 1, temp);
//         return temp;
//     }
    
//     public int height(TreeNode root) {
//         if (root == null) return 0;
//         return Math.max(height(root.left),height(root.right)) + 1;
//     }
    
    // Use queue
    // public List<List<Integer>> levelOrder(TreeNode root){
    //     if (root == null) return new ArrayList<>();
    //     List<List<Integer>> res = new ArrayList<>();
    //     Queue<TreeNode> q = new LinkedList<>();
    //     q.add(root);
    //     while (!q.isEmpty()) {
    //         List<Integer> oneLevel = new ArrayList<>();
    //         int size = q.size();
    //         for (int i = size; i > 0; i--) {
    //             TreeNode t = q.peek();
    //             oneLevel.add(t.val);
    //             q.poll();
    //             if (t.left != null) {
    //                 q.add(t.left);
    //             }
    //             if (t.right != null) {
    //                 q.add(t.right);
    //             }
    //         }
    //         res.add(new ArrayList<>(oneLevel));
    //     }
    //     return res;
    // }
    
    private List<List<Integer>> res = new ArrayList<>();
    // Use recursion 
    public List<List<Integer>> levelOrder(TreeNode root){
        if (root == null)
            return new ArrayList<>();
        oneLevel(root, 0, res);
        return res;
    }
    
    public void oneLevel(TreeNode root, int level, List<List<Integer>> res) {
        if (res.size() == level)
            res.add(new ArrayList<>());
        res.get(level).add(root.val);
        if (root.left != null)
            oneLevel(root.left,level + 1, res);
        if (root.right != null)
            oneLevel(root.right, level + 1, res);
    }
}
