package com.key.rectangle;

import org.junit.Test;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 1;
        width = 1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String toString() {
        return "Rectangle[length = " + length + ", width = " + width + "]";
    }
}
