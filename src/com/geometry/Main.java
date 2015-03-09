package com.geometry;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(99.99,23.33);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

        Square square = new Square(99.99);
        System.out.println(square.area());
        System.out.println(square.perimeter());
    }
}
