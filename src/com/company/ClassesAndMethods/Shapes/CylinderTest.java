package com.company.ClassesAndMethods.Shapes;

public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cyl = new Cylinder(new Circle(5),2);
        double vol = cyl.volume();
        System.out.println("radius = 5 height = 2 volume = " + vol);
        double sa = cyl.surfaceArea();
        System.out.println("surface area = " + sa);

        Cylinder cyl2 = new Cylinder(new Circle (8), 6);
        vol = cyl2.volume();
        System.out.println("radius = 8 height = 6 volume = " + vol);
        sa = cyl2.surfaceArea();
        System.out.println("surface area = " + sa);
    }
}