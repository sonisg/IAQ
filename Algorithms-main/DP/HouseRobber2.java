class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        } else if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int max1 = robs(nums, 0, n-2);
        int max2 = robs(nums, 1, n-1);

        return Math.max(max1, max2);
    }

    private int robs(int[]nums, int start, int end){
        int prevMax = nums[start];
        int currMax = Math.max(nums[start], nums[start + 1]);

        for (int i = start + 2; i <= end; i++) {
            int temp = currMax;
            currMax = Math.max(currMax, prevMax + nums[i]);
            prevMax = temp;
        }

        return currMax;
     }
}
