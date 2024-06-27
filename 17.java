// Find the Highest Altitude
class Solution {
    public int largestAltitude(int[] gain) {
        int[] left = new int[gain.length+1];
        left[0] = 0;
        for(int i = 1 ; i < left.length ; i++){
            left[i] = gain[i-1] + left[i-1];
        }
        int max = 0;
        for(int i = 0 ; i < left.length ; i++){
            if(left[i] > max){
                max = left[i];
            }
        }
        return max;
    }
}
