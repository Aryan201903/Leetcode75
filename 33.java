// 872. Leaf-Similar Trees

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();
        dfs(root1,r1);
        dfs(root2,r2);
        return r1.equals(r2);
    }
    public void dfs(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        dfs(root.left,res);
        dfs(root.right,res);
        if(root.left == null && root.right == null){
            res.add(root.val);
        }   
    }
}
