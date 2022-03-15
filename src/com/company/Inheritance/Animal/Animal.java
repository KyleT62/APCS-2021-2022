package com.company.Inheritance.Animal;

public class Animal {
    private String species;
    private String name;
    private String type;

    public Animal(String Name, String Species, String Type){
        species = Species;
        name = Name;
        type = Type;
    }

    public String toString(){
        return name + " the " + species + " is a " + type;
    }
}
