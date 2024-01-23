package com.company.oops;

public class ContructorChaining {

     ContructorChaining(){
        this(5);
        System.out.println("Hello");
    }

    ContructorChaining(int x){
         this(5,10);
         System.out.println("Hello" + x);
    }

    ContructorChaining(int x, int y){
        System.out.println("Hello" + x*y);
    }


    public static void main(String args[]){
        new ContructorChaining();
    }
}
