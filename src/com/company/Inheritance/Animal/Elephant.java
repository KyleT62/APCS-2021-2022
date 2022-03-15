package com.company.Inheritance.Animal;

public class Elephant extends Herbivore{
    private String name;
    private double length;
    public Elephant(String Name, double Length){
        super(Name,"Elephant");
        length = Length;
    }
    public String toString(){
        return super.toString() + " with tusks " + length + " meters long";
    }
}
