package solid;

public class Switch {
    LightBulb lightBulb;
    public Switch (){
        lightBulb= new LightBulb();
    }
    public void flip(){
        if(lightBulb.isOn)lightBulb.turnOff();
        else lightBulb.turnOn();
    }
}
