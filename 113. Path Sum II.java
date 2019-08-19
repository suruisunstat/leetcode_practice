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

// above my own solution is not time efficient

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// not necessarily non negative numbers, to the leaf 
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        if (root == null) return result;
        DFS(result,temp,root,sum);
        return result;
    }
    
    public void DFS(List<List<Integer>> result, List<Integer> temp, TreeNode root, int sum) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            temp.add(root.val);
            if (sumOfPath(temp) == sum) {
                result.add(new ArrayList(temp));
            }
            temp.remove(temp.size()-1);
            return;
        }
        else {
            temp.add(root.val);
            DFS(result,temp,root.left,sum);
            DFS(result,temp,root.right,sum);
            temp.remove(temp.size() - 1);
        }
    }
    
    int sumOfPath(List<Integer> temp) {
        int sum = 0;
        for (int i = 0; i < temp.size(); i++) {
            sum += temp.get(i);
        }
        return sum;
    }
}
