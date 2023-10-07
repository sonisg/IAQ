package com.company.basics;

public class PrimeNumber {

    public static void main(String[] args)
    {
        if (isPrime(57)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    static int i = 2;
    private static boolean isPrime(int n) {
        if(n == 0 || n ==1){
            return false;
        }
        if(n==i){
            return true;
        }
        if(n % i == 0){
            return false;
        }
        i++;
        return true;
    }
}
