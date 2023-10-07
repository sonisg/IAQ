class Solution {
    public int mySqrt(int x) {
        int low = 1, high = x;
        if((x==0)||(x==1)){
            return x;
        }

        while (low<=high) {
            int mid = (low+high)/2;
            if(x/mid==mid){
                return mid;
            }
            else if(x/mid<mid){
                high=mid-1;
            }
            else if(x/mid>mid){
                low=mid+1;
            }
            
        }
        return high;
    }
}


// Example 1:

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.
// Example 2:

// Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
