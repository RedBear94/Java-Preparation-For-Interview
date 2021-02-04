package com.hw1.figures;

public class Triangle extends Figurе{
    private double a;
    private double b;
    private double c;
    private double h;

    @Override
    public double getArea(){
        return (a*h)/2;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
