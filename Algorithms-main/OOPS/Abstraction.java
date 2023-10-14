package com.company.oops;

/** Data Abstraction is the property by virtue of which only the essential details are displayed to the user. **/


abstract class Animal {

    String name;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void makeSound();

    public Animal(String name) {
        this.name = name;
    }

    public String getName(String name){
        return name;
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println( "Bow, bow");
    }
}


public class Abstraction {
    public static void main(String args[]){
        Animal animal = new Dog("Tuffy");
        animal.makeSound();
    }
}
