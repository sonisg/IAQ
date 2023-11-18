class Solution {
    public int trap(int[] height) {
        int n = height.length;

        if(n<=2){
            return 0;
        }

        int[] left = new int[n];
        int[] right = new int[n];

        left[0]= height[0];
        for(int i =1;i<n;i++){
            left[i]= Math.max(left[i-1], height[i]);
        }
        right[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }

        int trap = 0;
        for(int i =1 ; i<n-1; i++){
           trap += Math.max(0, Math.min(left[i], right[i]) - height[i]);
        }
        return trap;      
    }
}

// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
// Example 2:

// Input: height = [4,2,0,3,2,5]
// Output: 9
