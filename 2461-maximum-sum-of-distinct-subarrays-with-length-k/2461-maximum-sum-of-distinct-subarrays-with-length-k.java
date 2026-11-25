class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        long windowSum = 0;
        long maxSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k) {
            maxSum = windowSum;
        }

        for (int i = k; i < nums.length; i++) {

            int outgoing = nums[i - k];

            map.put(outgoing, map.get(outgoing) - 1);

            if (map.get(outgoing) == 0) {
                map.remove(outgoing);
            }

            windowSum -= outgoing;

            int incoming = nums[i];

            map.put(incoming, map.getOrDefault(incoming, 0) + 1);

            windowSum += incoming;

            if (map.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;

    }
}