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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        
        Queue<TreeNode> nodeQ = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        nodeQ.offer(root);
        
        while(!nodeQ.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int levelSize = nodeQ.size();
            
            for(int i = 0; i < levelSize; i++) {
                TreeNode node = nodeQ.poll();
                level.add(node.val);
                if(node.left != null) {
                    nodeQ.offer(node.left);
                }
                if(node.right != null) {
                    nodeQ.offer(node.right);
                }
            }
            
            result.add(level);
        }
        return result;
    }
}