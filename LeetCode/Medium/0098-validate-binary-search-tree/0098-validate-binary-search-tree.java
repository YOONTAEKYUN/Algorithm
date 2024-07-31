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
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean validate(TreeNode current, Long min, Long max) {
        if(current == null) return true;
        
        
        if(current.val <= min) {
            return false;
        }
        
        if(current.val >= max) {
            return false;
        }
        
        return validate(current.left, min, Long.valueOf(current.val)) 
            && validate(current.right, Long.valueOf(current.val), max);
    }
}