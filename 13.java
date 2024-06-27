// Maximum Average Subarray I
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum += nums[i];
        }   
        maxSum = sum;
        int start = 0;
        int end = k;
        while(end < nums.length){
            sum -= nums[start++];
            sum += nums[end++];
            maxSum = Math.max(sum , maxSum);
        }

        return (double)maxSum/k;
    }
}
