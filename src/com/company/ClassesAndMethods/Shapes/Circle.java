package com.company.ClassesAndMethods.Shapes;

public class Circle {
    private double radius;

    public Circle (double radius)
    {
        this.radius = radius;
    }

    public double area ()
    {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    public double circumference ()
    {
        return (Math.PI * 2 * this.radius);
    }

}