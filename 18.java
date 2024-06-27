class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum == totalSum - sum - nums[i]) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
