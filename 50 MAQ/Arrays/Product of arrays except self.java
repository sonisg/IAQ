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

Algo:
Calculate left and right product and then multiply.

Tc: O(n);
