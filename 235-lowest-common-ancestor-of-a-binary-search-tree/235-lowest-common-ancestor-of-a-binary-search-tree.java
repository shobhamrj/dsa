/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode d1, TreeNode d2) {
        if(d1.val < root.val && d2.val < root.val) {
            return lowestCommonAncestor(root.left, d1, d2);
        }
        if(d1.val > root.val && d2.val > root.val) {
            return lowestCommonAncestor(root.right, d1, d2);
        }
        return root;
    }
}