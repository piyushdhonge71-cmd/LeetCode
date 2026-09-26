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
    ArrayList<Integer> list = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inOrder(root);
        return build(0, list.size()-1);
      
    }
    void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
    TreeNode build(int s, int e){
        if(s > e){
            return null;
        }
        int mid = s + (e-s)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = build(s, mid-1);
        root.right = build(mid+1, e);
        return root;
    }
    
}