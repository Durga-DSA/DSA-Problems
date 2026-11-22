class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefixSum = 0;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int ans =0;
        map.put(0, 1);
        
        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];

            int remainder = ((prefixSum % k) + k) % k;

            ans += map.getOrDefault(remainder, 0);

            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return ans;
    }
}