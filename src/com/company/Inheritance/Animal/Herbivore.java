package com.company.Inheritance.Animal;

public class Herbivore extends Animal{
    private String species;
    private String name;
    public Herbivore(String Name, String Species){
        super(Name,Species,"Herbivore");
    }
    public String toString(){
        return super.toString();
    }
}
