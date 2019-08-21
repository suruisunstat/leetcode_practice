/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

// use the 3rd solution 

// using queue is easy
class Solution {
    // public Node connect(Node root) {
    //     if (root == null) return null;
    //     Queue<Node> queue = new LinkedList<>();
    //     queue.add(root);
    //     while (!queue.isEmpty()) {
    //         int size = queue.size();
    //         for (int i = 0; i < size; i++) {
    //             Node node = queue.poll();
    //             if (node.left != null) {
    //                 queue.add(node.left);
    //             }
    //             if (node.right != null) {
    //                 queue.add(node.right);
    //             }
    //             if (i < size - 1) {
    //                 node.next = queue.peek();
    //             }
    //         }
    //     }
    //     return root;
    // }
    
    // space: 
    // time: 
    
    // public Node connect(Node root) {
    //     if (root == null) return null;
    //     Node p = root.next;
    //     while (p != null) {
    //         if (p.left != null) {
    //             p = p.left;
    //             break;
    //         }
    //         if (p.right != null) {
    //             p = p.right;
    //             break;
    //         }
    //         p = p.next;
    //     }
    //     if (root.right != null) root.right.next = p;
    //     if (root.left != null) root.left.next = root.right != null ? root.right: p;
    //     connect(root.right);
    //     connect(root.left);
    //     return root;
    // }
    public Node connect(Node root) {
        Node dummy = new Node(0,null,null,null);
        Node cur = dummy;
        Node head = root;
        while(root != null) {
            if (root.left != null) {
                cur.next = root.left;
                cur = cur.next;
            }
            if (root.right != null) {
                cur.next = root.right;
                cur = cur.next;
            }
            root = root.next;
            if (root == null) {
                cur = dummy;
                root = dummy.next;
                dummy.next = null;
            }
        }
        return head;
    }
        
}
