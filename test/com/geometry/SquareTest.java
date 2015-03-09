package com.geometry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jaiprak on 3/9/2015.
 */
public class SquareTest {
    @Test
    public void test_area_should_give_16_for_square_having_side_of_4() {
        Square sqr = new Square(4);
        assertEquals(16, sqr.area(), 0.0);
    }

    @Test
    public void test_area_should_give_25_for_square_having_side_of_5() {
        Square sqr = new Square(5);
        assertEquals(25, sqr.area(), 0.0);
    }

    @Test
    public void test_perimeter_should_give_20_for_square_having_side_of_5() {
        Square sqr = new Square(5);
        assertEquals(20, sqr.perimeter(), 0.0);
    }

    @Test
    public void test_perimeter_should_give_16_for_square_having_side_of_4() {
        Square sqr = new Square(4);
        assertEquals(16, sqr.perimeter(), 0.0);
    }
}
