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
//     private TreeNode res;
    
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if (root == null) return null;
//         lca(root,p,q);
//         return res;
//     }
    
//     public boolean lca(TreeNode root, TreeNode p, TreeNode q) {
//         if (root == null) return false;
//         int isLeft = lca(root.left,p,q) ? 1 : 0;
//         int isRight = lca(root.right,p,q) ? 1 : 0;
//         int mid = (root == p || root == q) ? 1 : 0;
//         if (isLeft + isRight + mid >= 2) {
//             res = root;
//         }
//         return (isLeft==1) || (isRight==1) || (mid==1);
//     }
    
    
    // iteration 
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if (root == null) return null;
//         Map<TreeNode, TreeNode> mapping = new HashMap<>();
//         mapping.put(root,null);
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.add(root);
//         while (!mapping.containsKey(p) || !mapping.containsKey(q)) {
//             TreeNode node = queue.poll();
//             if (node.left != null) {
//                 queue.add(node.left);
//                 mapping.put(node.left,node);
//             }
//             if (node.right != null) {
//                 queue.add(node.right);
//                 mapping.put(node.right,node);
//             }
//         }
        
//         // for (Map.Entry<TreeNode,TreeNode> entry : mapping.entrySet())  
//         //     System.out.println("Key = " + entry.getKey() + 
//         //                      ", Value = " + entry.getValue()); 
        
//         // p's parent traversal
//         List<TreeNode> parent_p = new ArrayList<>();
//         while (p != null){
//             parent_p.add(p);
//             p = mapping.get(p);
//         }
//         // p's parent: [2,6]
//         // for(int j = 0; j < parent_p.size(); j++){
//         //     System.out.println(parent_p.get(j).val);
//         // }
        
//         // q: 8
//         while (!parent_p.contains(q)){
//             q = mapping.get(q);
//             //System.out.println(q.val);
//         }
//         return q;
//     }
    
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     int parentVal = root.val;
    //     int pVal = p.val;
    //     int qVal = q.val;
    //     if (pVal > parentVal && qVal > parentVal) {
    //         return lowestCommonAncestor(root.right, p, q);
    //     } else if (pVal < parentVal && qVal < parentVal) {
    //         return lowestCommonAncestor(root.left, p, q);
    //     } else {
    //         return root;
    //     }
    // }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;
        int pVal = p.val;
        int qVal = q.val;
        while(node != null) {
            int nodeVal = node.val;
            if (pVal > nodeVal && qVal > nodeVal) {
                node = node.right;
            } else if (pVal < nodeVal && qVal < nodeVal) {
                node = node.left;
            } else {
                return node;
            }
        }
        return null;
    }
}
