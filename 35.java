// Path Sum III
class Solution {
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        getCount(root, 0L, targetSum, map);
        return count;
    }

    public void getCount(TreeNode root, long sum, int target, HashMap<Long, Integer> map) {
        if (root == null) return;
        sum += root.val;
        if (map.containsKey(sum - target)) {
            count += map.get(sum - target);
        }
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        getCount(root.left, sum, target, map);
        getCount(root.right, sum, target, map);
        map.put(sum, map.get(sum) - 1);
    }
}
