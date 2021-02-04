package com.hw1.figures;

public class Square extends Figurе{
    private double a;

    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }
}
