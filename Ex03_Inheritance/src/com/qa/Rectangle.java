package com.qa;

public class Rectangle extends Shape{
    private double height, width;

    public Rectangle(String name, String colour, double x, double z, double width, double height) {
        super(name, colour, x, z);
        this.width = width;
        this.height = height;
    }

    public boolean isSquare(){
        return(width == height);
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public Point getCentrePoint(){
        double centreX = getX() + width / 2;
        double centreZ = getZ() + height / 2;
        return new Point(centreX, centreZ);
    }
}
