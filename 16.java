class Solution {
    public int longestSubarray(int[] nums) {
        int curr = 0;
        int prev = 0;
        int max = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1) curr++;
            else{
                max = Math.max(max , prev + curr);
                prev = curr;
                curr = 0;
            }
        }
        max = Math.max(max , prev + curr);
        return max == nums.length ? max - 1 : max;
    }
}
