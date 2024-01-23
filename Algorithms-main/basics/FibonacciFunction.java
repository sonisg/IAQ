package com.company.basics;

public class FibonacciFunction {

    void fib(int n){

        int firstNo = 0;
        int secondNo = 1;
        int c =0;
        while(c < n) {
            System.out.println(firstNo);
            int thirdNo = firstNo + secondNo;
            firstNo = secondNo;
            secondNo = thirdNo;
            c++;
        }

        /** Time Complexity = O(n) **/
    }

    /**Recurssive**/
    int fibonacci(int n)
    {
        if (n <= 1)
            return n;

        // Recursive call
        return fibonacci(n - 1)
                + fibonacci(n - 2);
        /** Time Complexity = O(2^n)**/
    }
}
