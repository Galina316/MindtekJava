package solid;

public class LightBulb implements Swichable{
    // Bad Example
   boolean isOn;

    @Override
    public boolean isOn() {
        isOn =true;
        System.out.println("Light is On");
        return true;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}




