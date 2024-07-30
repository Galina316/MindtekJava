package solid;

public class DecorBulb {
    boolean isOn;
    boolean isOn(){
        return isOn;
    }
    public void turnOn() {
        isOn=true;
        System.out.println("Light on");
    }

    public void turnOff() {
        isOn=false;
        System.out.println("Light is Off");
    }
}
