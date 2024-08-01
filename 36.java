
 // Longest ZigZag Path in a Binary Tree
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
    int max = 0;
    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;
        longestStep(root , 0 , true);
        return max;
    }
    public void longestStep(TreeNode root , int steps , boolean goLeft){
        if(root == null) return;
        max = Math.max(max , steps);
        if(goLeft){
            longestStep(root.left , steps+1 , false);
            longestStep(root.right , 1 , true );
        }
        else{
            longestStep(root.right , steps+1 , true );
            longestStep(root.left , 1 , false );
        }
    }
}
