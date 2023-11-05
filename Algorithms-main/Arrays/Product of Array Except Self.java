class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] left = new int[n];
    int[] right = new int[n];
    int[] result = new int[n];
    int l =1;
    int r =1;

    for(int i =0;i<n;i++){
        left[i]=l;
        l=l*nums[i];   
    }

    for(int i =n-1;i>=0;i--){
        right[i]=r;
        r=r*nums[i];   
    }
    for(int i =0;i<n;i++){
        result[i]=left[i]*right[i];
    }
    return result;
    }
}


// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]
