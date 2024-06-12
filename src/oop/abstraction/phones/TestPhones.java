package oop.abstraction.phones;

public class TestPhones {
    public static void main(String[] args) {
        IPhone IPhone = new IPhone();
        Samsung samsung = new Samsung();
        System.out.println(IPhone.call());
        System.out.println(CloudStorage.CLOUDMEMORY);
        System.out.println(samsung.takePhoto());


    }
}
