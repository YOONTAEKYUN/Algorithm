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
    List<Integer> result = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        execute(root);
        return result;
    }
    
    private void execute(TreeNode root){
        if(root == null) return;
        
        execute(root.left);
        result.add(root.val);
        execute(root.right);
    }
}