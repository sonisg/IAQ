class Solution {
    public int removeDuplicates(int[] nums) {
        int k =0;
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            if(h.containsKey(nums[i]) && h.get(nums[i]) < 2){
                h.put(nums[i], h.get(nums[i]) + 1);
                nums[k] = nums[i];
                k++;
            } else if (!h.containsKey(nums[i])){
                h.put(nums[i], 1);
                 nums[k] = nums[i];
                k++;
            } 
        }
        return k;
    }
}

// Example 1:

// Input: nums = [1,1,1,2,2,3]
// Output: 5, nums = [1,1,2,2,3,_]
// Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).
// Example 2:

// Input: nums = [0,0,1,1,1,1,2,3,3]
// Output: 7, nums = [0,0,1,1,2,3,3,_,_]
// Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).
