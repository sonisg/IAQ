class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            int dif = target - nums[i];
            if(h.containsKey(dif)){
                return new int []{h.get(dif), i};
            } else{
                h.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
Time complexity: O(n);

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a copy of the original array along with their indices
        int n = nums.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort the array along with indices
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));

        // Use two pointers to find the pair that sums up to the target
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = nums[indices[left]] + nums[indices[right]];
            if (sum == target) {
                return new int[]{indices[left], indices[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }
}
Time complexity: O(nlog(n))
