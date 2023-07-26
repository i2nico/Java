package com.qa;

public class Main {
    public static void main(String[] args) {
        Circle C1 = new Circle ("circle1", "red", 0,0, 10);
        Circle C2 = new Circle ("circle2", "blue", 10,10, 5);

        System.out.println(C1);
        System.out.println(C2);

        System.out.println("Circle location before move: " + C1.getCurrentLocation());

        C1.move(2.5, 7.9);
        System.out.println("Circle location before move: " + C1.getCurrentLocation());

    }
}