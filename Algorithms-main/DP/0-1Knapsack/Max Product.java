class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] maxProduct = new int[n];
        int[] minProduct = new int[n];

        maxProduct[0] = nums[0];
        minProduct[0] = nums[0];
        int ans = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                int temp = maxProduct[i - 1];
                maxProduct[i - 1] = minProduct[i - 1];
                minProduct[i - 1] = temp;
            }

            maxProduct[i] = Math.max(nums[i], maxProduct[i - 1] * nums[i]);
            minProduct[i] = Math.min(nums[i], minProduct[i - 1] * nums[i]);

            ans = Math.max(ans, maxProduct[i]);
        }

        return ans;
    }
}
