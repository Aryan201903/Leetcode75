// Count good nodes in a BST
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
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int goodNode = 1;
        goodNode += countGood(root.left , root.val);
        goodNode += countGood(root.right , root.val);
        return goodNode;
    }
    public int countGood(TreeNode root , int max){
        if(root == null) return 0;
        int count = 0;
        if(root.val >= max){
            count++;
            max = root.val;
        }
        count += countGood(root.left , max);
        count += countGood(root.right , max);
        return count;
    }
}
