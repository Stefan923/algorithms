/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    
    private List<Integer> values = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        recursiveTraversal(root, values);
        
        return values;
    }
    
    public void recursiveTraversal(TreeNode root, List<Integer> values) {
        if (root == null) {
            return;
        }
        
        recursiveTraversal(root.left, values);
        values.add(root.val);
        recursiveTraversal(root.right, values);
    }
    
}
