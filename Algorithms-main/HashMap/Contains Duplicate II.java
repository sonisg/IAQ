class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0;i<nums.length; i++){
            int num = nums[i];
            if(hash.containsKey(num) && i - hash.get(num) <= k){
                return true;
            }
            hash.put(num, i);
        }  
        return false;
    }
}


// Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true
// Example 2:

// Input: nums = [1,0,1,1], k = 1
// Output: true
// Example 3:

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false
