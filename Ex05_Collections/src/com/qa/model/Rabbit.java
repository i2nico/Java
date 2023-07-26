package com.qa.model;

public class Rabbit extends Animal{

    public Rabbit(String name, int age) {
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
        return "Rabbit: " + super.toString();
    }
}
