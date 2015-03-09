package com.geometry;

import com.geometry.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jaiprak on 3/9/2015.
 */
public class RectangleTest {
    @Test
    public void test_area_should_return_area_of_10_x_20_equals_40_rectangle(){
        Rectangle rect = new Rectangle(10,20);
        assertEquals(200,rect.area(),0.0);
    }

    @Test
    public void test_area_should_return_area_of_5_x_5_equals_25_rectangle(){
        Rectangle rect = new Rectangle(5,5);
        assertEquals(25,rect.area(),0.1);
    }

    @Test
    public void test_area_should_return_perimeter_of_10_x_20_equals_60_rectangle(){
        Rectangle rect = new Rectangle(10,20);
        assertEquals(60,rect.perimeter(),0.0);
    }

    @Test
    public void test_area_should_return_perimeter_of_5_x_5_equals_20_rectangle(){
        Rectangle rect = new Rectangle(5,5);
        assertEquals(20, rect.perimeter(), 0.0);
    }


}
