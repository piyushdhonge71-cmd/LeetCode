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
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return list;
        }
        dfs(root,"");
        return list;
      
    }

    public void dfs(TreeNode root, String path){
        path += root.val;    // string is immutable It created a new String parent call doesn't change.

        if(root.left == null && root.right == null){
            list.add(path);
        }
        path += "->";

        if(root.left != null){
            dfs(root.left, path);        // It created new path for new function.
        }
        if(root.right != null){
            dfs(root.right, path);    // we can say it automatically Backtrack.
        }
    }
}