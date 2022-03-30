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
    public TreeNode insertIntoBST(TreeNode root, int data) {
        if (root == null){
            return new TreeNode(data);
        }
        if (data < root.val) {
          root.left = insertIntoBST(root.left, data);
        } else if(data > root.val) {
          root.right = insertIntoBST(root.right, data);
        }
        return root;
    }
}