class Solution {
    public int findMaxLength(int[] nums) {
        int prefixSum = 0;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,-1);
        int max_len = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)
                prefixSum += -1;

            prefixSum += nums[i];

            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,i);
            }
            else{
                max_len = Math.max(max_len, i - map.get(prefixSum));
            }
        }

        return max_len;
    }
}