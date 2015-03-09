package com.geometry;

/**
 * Created by jaiprak on 3/9/2015.
 */
public class Rectangle {
    private double length,breath;
    Rectangle(double length,double breath){
        this.length = length;
        this.breath = breath;
    }

    public double area(){
        return length*breath;
    }

    public double perimeter(){
        return 2*(length+breath);
    }
}
