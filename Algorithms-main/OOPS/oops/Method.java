package com.company.oops;

public class Method extends MethodOverEx implements base{

    @Override
    public void sum() {
        System.out.println("Method class");
    }

    public static void main(String args[])
    {
       Method m = new Method();
       m.sum();
    }

    public static void main(String args[], int y)
    {
        Method m = new Method();
        m.sum();
    }
}
