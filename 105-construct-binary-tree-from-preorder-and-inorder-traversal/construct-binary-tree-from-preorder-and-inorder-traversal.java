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
    int preIdx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return helper(preorder, inorder, 0, inorder.length-1);
    }
    TreeNode helper(int[] preorder, int[] inorder, int left, int right){
        if(left > right){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIdx]);
        int inIdx = search(inorder, preorder[preIdx], left, right);
        preIdx++;
        
        root.left = helper(preorder, inorder, left,inIdx-1);
        root.right = helper(preorder, inorder, inIdx+1,right);
        return root;
    }
    int search(int[] inorder, int val, int left, int right){
        for(int i=left; i<=right; i++){
            if(inorder[i] == val){
                return i;
            }
           
        }
        return -1;
    }
}