package com.company.basics;

public class PalindromeString {

    public static void main(String[] args)
    {


        String num = "12121";
        int len = num.length();
        String rev = "";
        for (int i = len- 1; i >= 0 ; --i){
            rev = rev + num.charAt(i);
        }
        if(num.equals(rev)){
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println(" Not Pallindrome");
        }

    }
}
