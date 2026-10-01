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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }
        sum = (sum*10)+ root.val;
        if(root.left == null && root.right == null){
            int ans = sum;
            sum = (sum-root.val)/10;
            return ans;
        }
        
        int left = sumNumbers(root.left);
        int right = sumNumbers(root.right);

        sum = (sum-root.val)/10;

        return left + right;
        
    }
}