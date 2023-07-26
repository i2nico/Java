package com.qa;

public class Main {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle("rectangle1", "yellow", 0, 0, 10, 10);
        Rectangle R2 = new Rectangle("rectangle1", "green", 2, 2, 5, 2);

        System.out.println(R1);
        System.out.println(R2);

        System.out.println(R1 + ", CentrePoint is: "
                + R1.getCentrePoint() + ", Area is: " + R1.getArea()
                + ". Is it square? " + R1.isSquare());
        System.out.println(R2 + ", CentrePoint is: "
                + R2.getCentrePoint() + ", Area is: " + R2.getArea()
                + ". Is it square? " + R2.isSquare());

        Circle C1 = new Circle("Circle1", "red", 0, 0, 10);
        Circle C2 = new Circle("Circle2", "blue", 10, 10, 5);

        System.out.println(C1);
        System.out.println(C2);





    }
}