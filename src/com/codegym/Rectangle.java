package com.codegym;

public class Rectangle {
    double witdh;
    double height;

    public Rectangle(double witdh, double height) {
        this.witdh = witdh;
        this.height = height;
    }
    public double getArea() {
        return this.witdh * this.height;
    }
    public double getPerimeter() {
        return (this.height + this.witdh) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "witdh=" + witdh +
                ", height=" + height +
                '}';
    }
}

