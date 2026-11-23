class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long windowSum = 0;
        //double max_avg = Integer.MIN_VALUE;

        for(int i=0; i<k; i++){
            windowSum += nums[i];
        }
        double max_avg = windowSum;
        
        for(int i=k; i<nums.length; i++){
            windowSum = windowSum + nums[i] - nums[i-k];
            max_avg = Math.max(max_avg, windowSum);
        }

        return max_avg/k;
    }
}