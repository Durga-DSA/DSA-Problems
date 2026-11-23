class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int avg = 0;
        double max_avg = Integer.MIN_VALUE;

        for(int i=0; i<k; i++){
            avg += nums[i];
        }
        max_avg = Math.max(max_avg, avg);
        
        for(int i=k; i<nums.length; i++){
            avg = avg + nums[i] - nums[i-k];
            max_avg = Math.max(max_avg, avg);
        }

        return max_avg/k;
    }
}