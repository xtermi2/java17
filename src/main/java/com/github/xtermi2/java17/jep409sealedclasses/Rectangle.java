package com.github.xtermi2.java17.jep409sealedclasses;

public final class Rectangle extends Shape {

    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateArea() {
        return a * b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
