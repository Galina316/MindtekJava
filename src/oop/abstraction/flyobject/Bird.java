package oop.abstraction.flyobject;

public class Bird extends Object implements Flyable,Noise {
    @Override
    public String fly() {
        return "Bird is flying.....";
    }

    @Override
    public String makeNoise() {
        return "Chik chirik";
    }
}
