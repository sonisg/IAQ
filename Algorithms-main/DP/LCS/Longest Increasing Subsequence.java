class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int []dp = new int[n];
        Arrays.fill(dp,1);

        for(int i = 1;i<n;i++){
            for(int j = 0; j< i;j++){
                if(nums[i] > nums[j]){
                    dp[i]= Math.max(dp[i], dp[j]+1);
                }
            }
        }

        int maxLength = 1;
        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
        
    }
}
// Given an integer array nums, return the length of the longest strictly increasing 
// subsequence
// .

 

// Example 1:

// Input: nums = [10,9,2,5,3,7,101,18]
// Output: 4
// Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
// Example 2:

// Input: nums = [0,1,0,3,2,3]
// Output: 4
