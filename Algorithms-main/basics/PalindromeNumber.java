package com.company.basics;

public class PalindromeNumber {
    public static void main(String[] args)
    {
        int num = 35531;
        int rev = 0, rem;
        int orgNum = num;
        while(num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        if(rev == orgNum){
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println(" Not Pallindrome");
        }
    }
}
