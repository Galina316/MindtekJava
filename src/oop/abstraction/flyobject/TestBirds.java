package oop.abstraction.flyobject;

public class TestBirds {
    public static void main(String[] args) {
        // interfaces can not be instantiated (create object)
        // Flyable flyable - new Flyable();

        Eagle eagle = new Eagle();
        System.out.println(eagle.fly());
        System.out.println(eagle.makeNoise());
        System.out.println(eagle.WINGS);
    }
}
