class Solution {
    public int longestConsecutive(int[] nums) {
    if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int length = 1;  
        int longestStreak = 1; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;  
            }

            if (nums[i] == nums[i - 1] + 1) {
                length++;
            } else {
                length = 1;
            }

            longestStreak = Math.max(longestStreak, length);
        }

        return longestStreak;    
    }
}



// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
