package com.qa.model;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello(){
        return "Hello" + getName();
    }

    @Override
    public String move(){
        return "Yes, sir!";
    }

    public String toString() {
        return "Dog: " + super.toString();
    }
}
