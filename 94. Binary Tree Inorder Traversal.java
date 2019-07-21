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
    // recursion: O(n)??
    private List<Integer> res = new ArrayList<>();
    
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     if (root == null) return new ArrayList<>();
    //     inorderTraversal(root.left);
    //     res.add(root.val);
    //     inorderTraversal(root.right);
    //     return res;
    // }
    
    //iterative:
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        stack.push(temp);
        while (!stack.isEmpty()) {
            while ((temp = stack.peek()) != null) {
                temp = temp.left;
                stack.push(temp);
            }
            stack.pop();
            
            if (!stack.isEmpty()) {
                temp = stack.pop();
                res.add(temp.val);
                stack.push(temp.right);
            }
        }
        return res;
    }
    
//    public List<Integer> preorderTraversal(TreeNode root) {
//        if (root == null) {
//            return list;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode tempNode = root;
//        stack.push(tempNode);
//        while (!stack.isEmpty()) {
//            tempNode = stack.peek();
//            list.add(tempNode.val);
//            stack.pop();
//            if (tempNode.right != null) {
//                stack.push(tempNode.right);
//            }
//            if (tempNode.left != null) {
//                stack.push(tempNode.left);
//            }
//        }
//        return list;
//    }

}
