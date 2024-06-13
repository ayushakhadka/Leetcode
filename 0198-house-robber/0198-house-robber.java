class Solution {
    public int rob(int[] nums) {
        // Edge case: if there are no houses
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // Edge case: if there is only one house
        if (nums.length == 1) {
            return nums[0];
        }

        // Initialize two variables to store the maximum money robbed up to the previous house
        int prev1 = 0; // dp[i-2]
        int prev2 = nums[0]; // dp[i-1]

        // Iterate over the houses starting from the second house
        for (int i = 1; i < nums.length; i++) {
            int current = Math.max(prev2, nums[i] + prev1); // dp[i] = max(dp[i-1], nums[i] + dp[i-2])
            prev1 = prev2; // Update dp[i-2] to dp[i-1]
            prev2 = current; // Update dp[i-1] to dp[i]
        }

        // The maximum money that can be robbed is stored in prev2
        return prev2;
    }
}
