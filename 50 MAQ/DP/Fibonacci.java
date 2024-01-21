class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        } 
        if(n==1){
            return 1;
        }

        return fib(n-1)+fib(n-2);
    }
}


Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.


Algo:
Write base condition and divide it into small parts and combine result.
