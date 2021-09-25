package com.key.rectangle;

import org.junit.Assert;
import org.junit.Test;

public class testRectangle {
    @Test
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 15);
        System.out.println("The area of r1 is " + r1.getArea()
                + "and the perimeter is " + r1.getPerimeter());

        Assert.assertFalse(r1.getLength() != 10);
        Assert.assertFalse(r1.getWidth() != 15);



        Rectangle r2 = new Rectangle(7, 13);
        System.out.println("The area of r2 is " + r2.getArea()
                + " and the perimeter is " + r2.getPerimeter());

        Assert.assertFalse(r2.getLength() != 7);
        Assert.assertFalse(r2.getWidth() != 13);
        Assert.assertTrue("Area should not be 100",r2.getArea() != 100);
        Assert.assertFalse("r2.getArea() does not return 91 like expected",r2.getArea() != 91);
    }
}
