package com.company.Inheritance.Animal;

public class AnimalTester {
    public static void main(String[] args) {
        Animal John = new Animal ("John","Lion","Carnivore");
        Herbivore Sam = new Herbivore("Sam","Giraffe");
        Elephant Yousef = new Elephant("Yousef",4.0);

        System.out.println(John);
        System.out.println(Sam);
        System.out.println(Yousef);
    }
}

/*
Output:
John the Lion is a Carnivore
Sam the Giraffe is a Herbivore
Yousef the Elephant is a Herbivore with tusks 4.0 meters long

 */
