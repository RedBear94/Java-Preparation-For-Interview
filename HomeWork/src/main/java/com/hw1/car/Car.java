package com.hw1.car;

abstract class Car {
    Engine engine;

    public String color;
    public String name;

    protected void start() {
        System.out.println("Car starting");
    }

    public void open(){
        System.out.println("Car is open");
    }

    public void move(){
        System.out.println("Car is moving");
    }

    public void stop(){
        System.out.println("Car is stop");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
