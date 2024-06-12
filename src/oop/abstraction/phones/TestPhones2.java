package oop.abstraction.phones;

import java.util.ArrayList;
import java.util.List;

public class TestPhones2 {
    public static void main(String[] args) {

        Storage phone = new IPhone();
        System.out.println(phone.delete());
        System.out.println(((Phone)phone).call());


        Phone iPhone = new IPhone();
        Phone samsung = new Samsung();
        List<Phone> phonesList = new ArrayList<>();
        phonesList.add(iPhone);
        phonesList.add(samsung);
    }
}
