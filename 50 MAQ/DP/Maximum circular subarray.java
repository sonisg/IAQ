class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int n = nums.length;
        int[] dpMax = new int[n];
        int[] dpMin = new int[n];
        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        int totalSum = nums[0];
        int max = nums[0];
        
        for (int i = 1; i < n; i++) {
            totalSum += nums[i];
            dpMax[i] = Math.max(nums[i], dpMax[i - 1] + nums[i]);
            dpMin[i] = Math.min(nums[i], dpMin[i - 1] + nums[i]);
            max = Math.max(max, dpMax[i]);
        }
        
        int circularMax = totalSum - Arrays.stream(dpMin).min().getAsInt();
        if (circularMax == totalSum || Arrays.stream(nums).allMatch(num -> num < 0)) {
            return max;
        } else {
            return Math.max(max, circularMax);
        }
    }
}

Algo:
Kadane's Algorithm for Non-Circular Subarrays:

We initialize two arrays, dpMax and dpMin, to store the maximum and minimum subarray sums ending at each position.
We iterate through the array and calculate dpMax[i] and dpMin[i] for each element using the recurrence relations:
dpMax[i] = max(nums[i], dpMax[i - 1] + nums[i])
dpMin[i] = min(nums[i], dpMin[i - 1] + nums[i])
We also calculate the total sum of the array (totalSum) and maintain the maximum subarray sum encountered so far (max).
Handling Circular Subarrays:

We calculate circularMax by subtracting the minimum subarray sum from the total sum of the array.
We check if all elements of the array are negative. If they are, we return the maximum single element as the result.
If circularMax is equal to totalSum, indicating that the circular maximum subarray sum is 0, we return max.
Otherwise, we return the maximum of max and circularMax.


TC: O(n)
