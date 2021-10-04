package com.key.rectangle;

import org.junit.Assert;
import org.junit.Test;

public class testRectangle {

    @Test
    public void testGetLength(){
        Rectangle r1 = new Rectangle(10, 15);
        Assert.assertTrue(r1.getLength() == 10);
    }

    @Test
    public void testGetWidth(){
        Rectangle r1 = new Rectangle(10, 15);
        Assert.assertTrue(r1.getWidth() == 15);
    }

    @Test
    public void testGetArea(){
        Rectangle r2 = new Rectangle(50, 40);
        Assert.assertTrue(r2.getArea() == 2000);
    }

    @Test
    public void testGetPerimeter(){
        Rectangle r2 = new Rectangle(50, 40);
        Assert.assertTrue(r2.getPerimeter() == 180);
    }

    @Test
    public void testSetLength(){
        Rectangle r3 = new Rectangle(125, 75);
        // Set length
        r3.setLength(99);
        Assert.assertTrue(r3.getLength() == 99);
    }

    @Test
    public void testSetWidth(){
        Rectangle r3 = new Rectangle(125, 75);
        // Set width
        r3.setWidth(150);
        Assert.assertTrue(r3.getWidth() == 150);
    }

}
