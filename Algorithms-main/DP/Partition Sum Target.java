class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        return isSubset(nums, target, nums.length);
    }

    public boolean isSubset(int[] arr, int sum, int n) {
    boolean[][] dp = new boolean[n + 1][sum + 1];

    for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
    }

    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=sum; j++) {
            if (arr[i - 1] > j) {
                dp[i][j] = dp[i - 1][j];
            } else {
                dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
            }
        }
    }
    return dp[n][sum];
}

}

// Example 1:

// Input: nums = [1,5,11,5]
// Output: true
// Explanation: The array can be partitioned as [1, 5, 5] and [11].
// Example 2:

// Input: nums = [1,2,3,5]
// Output: false
// Explanation: The array cannot be partitioned into equal sum subsets.
