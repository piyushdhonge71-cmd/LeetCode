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
    public void flatten(TreeNode root) {
        if(root == null ){
            return ;
        }
        TreeNode orgRight = root.right;

        if(root.left != null ){
         TreeNode node = root.left;
        
        while(node.right != null){
            node = node.right;
        }
        root.right = root.left;
        node.right = orgRight;
        root.left = null;
        }

       flatten(root.right);


        
    }
}