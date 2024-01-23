package com.company.oops;
// Method overriding
/** Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class.
    That base function is said to be overridden. **/

/** Virtual functions
 It allows an object of a derived class to behave as if it were an object of the base class.
 The derived class can override the virtual function of the base class to provide its own implementation.
 The function call is resolved at runtime, depending on the actual type of the object.
 **/

class Parents{
    void print(){
        System.out.println("Parent");
    }
}

class Child1 extends Parents{
    void print(){
        System.out.println("Child 1");
    }
}

class Child2 extends Parents{
    void print(){
        System.out.println("Child 2");
    }
}


public class RunTimePolymorphism {

    public static void main(String args[]){
        Parents p;
        p = new Child1();
        p.print();

        p = new Child2();
        p.print();
    }
}
