/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// class BSTIterator {
//     private List<Integer> num = new ArrayList<>();
//     private int Index = 0;
    
//     public BSTIterator(TreeNode root) {
//         inOrder(root);
//     }
    
//     public void inOrder(TreeNode root) {
//         if (root == null) return;
//         inOrder(root.left);
//         num.add(root.val);
//         inOrder(root.right);
//     }
    
//     /** @return the next smallest number */
//     public int next() {
//         int val = num.get(Index); // O(1)
//         Index++;
//         return val;
//     }
    
//     /** @return whether we have a next smallest number */
//     public boolean hasNext() {
//         return Index < num.size(); //O(1)
//     }
// }


class BSTIterator {
    Stack<TreeNode> stack;
    
    public BSTIterator(TreeNode root) {
        this.stack = new Stack<TreeNode>();
        this._leftmostInorder(root);
    }
    
    private void _leftmostInorder(TreeNode root) {
        while (root != null) {
            this.stack.push(root);
            root = root.left;
        }
    }
    
    public int next() {
        TreeNode topmostNode = this.stack.pop();
        if (topmostNode.right != null) {
            this._leftmostInorder(topmostNode.right);
        }
        return topmostNode.val;
    }
    
    public boolean hasNext() {
        //return this.stack.size() > 0;
        return !this.stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
