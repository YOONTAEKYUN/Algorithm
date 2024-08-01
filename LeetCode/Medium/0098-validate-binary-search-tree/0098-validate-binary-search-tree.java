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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean validate(TreeNode root, Long min, Long max) {
        if(root == null) return true;
        if(Long.valueOf(root.val) >= max || Long.valueOf(root.val) <= min) {
            return false;
        }
        
        return validate(root.left, min, Long.valueOf(root.val)) &&
            validate(root.right, Long.valueOf(root.val), max);
    }
}