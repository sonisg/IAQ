import java.util.Arrays;  
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int k = nums.length;
        return nums[k/2];
    }
}


// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
