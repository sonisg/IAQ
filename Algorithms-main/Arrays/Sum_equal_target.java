// Find two numbers in an array that add up to a target sum.

public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> n = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int com = target - nums[i];
            if(n.containsKey(com)){
                return new int[]{n.get(com), i};
            }
            n.put(nums[i], i);
        }
        return new int[]{};
    }
