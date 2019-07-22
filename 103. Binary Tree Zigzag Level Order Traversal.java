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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = levelOrder(root);
        List<List<Integer>> newRes = reOrder(res);
        return newRes;
    }
    
    public List<List<Integer>> levelOrder(TreeNode root){
        if (root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> oneLevel = new ArrayList<>();
            int size = q.size();
            for (int i = size; i > 0; i--) {
                TreeNode t = q.peek();
                oneLevel.add(t.val);
                q.poll();
                if (t.left != null) {
                    q.add(t.left);
                }
                if (t.right != null) {
                    q.add(t.right);
                }
            }
            res.add(new ArrayList<>(oneLevel));
        }
        return res;
    }
    
    public List<Integer> reverseArray(List<Integer> temp) {
        int lo = 0, hi = temp.size() - 1;
        while (lo < hi) {
            int t = temp.get(lo);
            temp.set(lo,temp.get(hi));
            temp.set(hi,t);
            lo++;
            hi--;
        }
        return temp;
    }
    
    
    public List<List<Integer>> reOrder(List<List<Integer>> res) {
        List<List<Integer>> newRes = new ArrayList<>();
        for (int i = 0; i < res.size(); i++) {
             List<Integer> temp = res.get(i);
            if (i % 2 == 0) {
               newRes.add(new ArrayList<>(temp));
            }
            else {
                //Collections.reverse(temp);
                List<Integer> reverseTemp = reverseArray(temp);
                newRes.add(new ArrayList<>(reverseTemp));
            }     
        }
        return newRes;
    }
}
// this solution is based on Question 102, and just simply reverse the order
