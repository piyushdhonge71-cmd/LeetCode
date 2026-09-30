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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode left = find(root, x);
        TreeNode right = find(root, y);

        return (level(root, left, 0) == level(root, right, 0)) && (!isSiblings(root,left,right));
        
    }
    TreeNode find(TreeNode root, int x){
        if(root == null){
            return null;
        }
        if(root.val == x){
            return root;
        }
        TreeNode n = find(root.left,x);
        if(n != null){
            return n;
        }
        return find(root.right,x);
    }
    int level(TreeNode root, TreeNode node,int lev){
        if(root == null){
            return 0;
        }
        if(root == node){
            return lev;
        }
        int n = level(root.left, node, lev+1);
        if(n != 0){
            return n;
        }
        return level(root.right, node, lev+1);
    }
    boolean isSiblings(TreeNode root, TreeNode left,TreeNode right){
        if(root == null){
            return false;
        }
        return (root.left == left && root.right == right) || (root.left == right && root.right == left) || isSiblings(root.left, left, right) || isSiblings(root.right, left, right);
    }

}