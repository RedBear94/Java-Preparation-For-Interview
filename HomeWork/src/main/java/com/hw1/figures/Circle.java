package com.hw1.figures;

public class Circle extends Figurе{
    private double r;

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2* Math.PI * r;
    }
}
