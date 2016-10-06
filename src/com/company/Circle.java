package com.company;

/**
 * Created by bc608 on 10/6/16.
 */
public class Circle {
    public double radius;
    public Circle(double r)
    {
        radius = r;
    }// The above is known as a constructor


    public double area()
    {
        double a = Math.PI * radius * radius;
        return a;
    }

    public double diameter()
    {
        double h = radius * 2;
        return h;
    }

    public double circum()
    {
        double k = 2 * Math.PI * radius;
        return k;
    }
    
}





