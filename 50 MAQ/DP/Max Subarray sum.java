class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        dp[0]=nums[0];
        int ans = dp[0];
        for(int i = 1; i<n;i++){
            dp[i] = Math.max(nums[i]+dp[i-1],nums[i]);
            ans = Math.max(dp[i], ans);
        }
        return ans;
    }
}


Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
For i = 1: dp[1] = max(1, 1 + (-2)) = 1, ans = max(1, -2) = 1
For i = 2: dp[2] = max(-2, -2 + 1) = -1, ans = max(-1, 1) = 1
For i = 3: dp[3] = max(4, 4 + (-1)) = 4, ans = max(4, 1) = 4
For i = 4: dp[4] = max(-1, -1 + 4) = 3, ans = max(3, 4) = 4
For i = 5: dp[5] = max(2, 2 + 3) = 5, ans = max(5, 4) = 5
For i = 6: dp[6] = max(1, 1 + 5) = 6, ans = max(6, 5) = 6
For i = 7: dp[7] = max(-5, -5 + 6) = 1, ans = max(1, 6) = 6
For i = 8: dp[8] = max(4, 4 + 1) = 5, ans = max(5, 6) = 6

ALGO:

Create an array dp of the same length as nums to store the maximum subarray sum ending at each index.
Set dp[0] to the first element of nums.
Initialize a variable ans to store the maximum subarray sum found so far, set it to dp[0].
Iterate through the array nums starting from index 1.
For each index i:
Update dp[i] with the maximum of either the current element nums[i] or the sum of the current element and the maximum subarray sum ending at the previous index dp[i - 1].
Update ans with the maximum of dp[i] and the current value of ans.

The dynamic programming array dp is updated in a way that represents the maximum subarray sum ending at each index.
The final result is stored in ans, which is 6. The corresponding subarray is [4, -1, 2, 1]


The overall time complexity is dominated by the dynamic programming loop, making it O(n).
