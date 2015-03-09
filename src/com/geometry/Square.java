package com.geometry;

/**
 * Created by jaiprak on 3/9/2015.
 */
public class Square {

    private double side;

    Square(double side){
        this.side=side;
    }

    public double area() {
        return side* side;
    }

    public double perimeter() {
        return 4*side;
    }
}
