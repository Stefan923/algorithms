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
    
    public int deepestLeavesSum(TreeNode root) {
        return helper(root, 0)[0];
    }
    
    private int[] helper(TreeNode root, int level) {
        if (root == null) {
            return new int[]{ 0, 0 };
        }
        
        if (root.left == null && root.right == null) {
            return new int[]{ root.val, level };
        }
        
        int[] leftResult = helper(root.left, level + 1);
        int[] rightResult = helper(root.right, level + 1);
        int[] currentResult = new int[]{ 0, level };
        
        if (leftResult[1] >= rightResult[1]) {
            currentResult[0] += leftResult[0];
            currentResult[1] = leftResult[1];
        }
        if (rightResult[1] >= leftResult[1]) {
            currentResult[0] += rightResult[0];
            currentResult[1] = rightResult[1];
        }
        
        return currentResult;
    }
    
}
