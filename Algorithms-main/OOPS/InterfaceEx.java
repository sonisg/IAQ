package com.company.oops;

/** Interface in Java programming language is defined as an abstract type used to specify the behavior of a class.**/


interface exampleInterface{
    int a = 10;
    public void print();
}

public class InterfaceEx implements exampleInterface{

    @Override
    public void print() {
        System.out.println("Interface Example");
    }

    public static void main(String[] args)
    {
        InterfaceEx t = new InterfaceEx();
        t.print();
        System.out.println(a);
    }
}
