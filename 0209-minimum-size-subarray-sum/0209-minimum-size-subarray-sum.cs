public class Solution {
    public int MinSubArrayLen(int target, int[] nums) {
        
        int left=0; 
        int min_len = int.MaxValue;
        int sum = 0;
        for(int i=0; i<nums.Length; i++){
            sum += nums[i];
            
            while(sum >= target){
                min_len = Math.Min(min_len, i - left+1);
                sum = sum - nums[left];
                left++;
            }
        }
        return min_len == int.MaxValue ? 0 : min_len;
    }
}