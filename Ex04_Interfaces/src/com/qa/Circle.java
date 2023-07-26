package com.qa;

public class Circle extends Shape implements Moveable{

    private double radius;

    public Circle(String name, String colour, double x, double z, double radius) {
        super(name, colour, x, z);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Point getCentrePoint(){
        return new Point(getX(), getZ());
    }

    @Override
    public Point getCurrentLocation() {
        return getCentrePoint();
    }
    @Override
    public void move(double x, double z) {
        setX(getX() + x);
        setZ(getZ() + z);
    }
}
