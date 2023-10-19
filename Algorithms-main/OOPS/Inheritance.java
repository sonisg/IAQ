package com.company.oops;


/** Inheritance is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class.
In Java, Inheritance means creating new classes based on existing ones.
A class that inherits from another class can reuse the methods and fields of that class **/

class Parent{
    int a;
    int b;

    public Parent(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int add (int a, int b){
        System.out.println("parent class");
        return a+b;
    }
}


class child extends Parent{
    int c;

    public child(int a, int b, int c) {
        super(a, b); //parent class
        this.c = c;
    }

    @Override
    public String toString() {
        return "child{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public int result (int a, int b, int c){
        System.out.println("child class");
        return c * add(a, b);
    }
}


public class Inheritance {

    public static void main(String args[])
    {
        child c = new child(2, 3, 4);
        System.out.println(c.result(2, 3, 4));

    }
}


