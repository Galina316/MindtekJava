package oop.inheritance;

import constructor.Car;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.eat());
        Dog dog = new Dog();
        System.out.println(dog.bark());
    }
}
