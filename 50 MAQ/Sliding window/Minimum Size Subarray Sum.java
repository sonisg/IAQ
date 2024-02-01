class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i =0,j=0;
        int max = Integer.MAX_VALUE;
        int sum =0;

        while(j<n){
            sum = sum + nums[j];
            while(sum>=target){
                max=Math.min(max,j-i+1);
                sum = sum - nums[i];
                i++; 
                
            }
            j++;
        }
        return max == Integer.MAX_VALUE ? 0 : max;
        
    }
}
