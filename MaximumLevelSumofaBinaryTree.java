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
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> que= new LinkedList<>();
        int maxSum = Integer.MIN_VALUE;
        int currLevel = 1;
        int res = 0;
        que.add(root);
        while(!que.isEmpty()){
            int sum = 0;
            int n = que.size();
            while(n > 0){
                TreeNode temp = que.poll();
                sum += temp.val;
                if(temp.left != null){
                    que.add(temp.left);
                }
                if(temp.right != null){
                    que.add(temp.right);
                }
                n--;
            }
            if(sum > maxSum){
                maxSum = sum;
                res = currLevel;
            }
            currLevel++;
        }
        return res;
    }
}
