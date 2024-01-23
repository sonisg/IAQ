package com.company.basics;

import com.company.oops.Method;

public class Rough {

    public static void main(String args[])
    {
        String s = "ab c ";
//        s = s.trim();  // Removes leading and trailing whitespaces
//
//        // Print the result
//        System.out.println("Original string: |" + " ab c " + "|");
//        System.out.println("Trimmed string : |" + s + "|");
//
//        String[] a = s.split("/s++");
//        for(String c: a){
//            System.out.print(c);
//        }


        char[] c = s.toCharArray();
        int count =0;
        for(Character ch:c){
            System.out.print(ch);
            if(Character.isWhitespace(ch)){
                break;
            }
            count++;
        }
        System.out.println(count);

    }
}
