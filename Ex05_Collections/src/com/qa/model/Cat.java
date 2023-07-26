package com.qa.model;

public class Cat extends Animal{

    public Cat(String name, int age) {
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
        return "Cat: " + super.toString();
    }
}
