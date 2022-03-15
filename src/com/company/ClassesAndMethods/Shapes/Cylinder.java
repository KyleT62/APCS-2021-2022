package com.company.ClassesAndMethods.Shapes;

public class Cylinder {
    private Circle c1;
    private double height;

    public Cylinder (Circle c1, double height)
    {
        this.c1 = c1;
        this.height = height;
    }

    public double volume ()
    {
        return (c1.area() * height);
    }

    public double surfaceArea ()
    {
        return (c1.circumference() * height);
    }

}