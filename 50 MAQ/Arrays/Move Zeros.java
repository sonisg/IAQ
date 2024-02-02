class Solution {
    public void moveZeroes(int[] nums) {
        int c =0;
        int n = nums.length;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!=0){
                nums[c]=nums[i];
                c++;
            }
        }
        while(c<n){
            nums[c++]=0;
        }   
    }
}
