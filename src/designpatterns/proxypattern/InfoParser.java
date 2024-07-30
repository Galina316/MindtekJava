package designpatterns.proxypattern;

import java.util.ArrayList;

public class InfoParser {
    private ArrayList<String>list;
    public InfoParser(){
        // connect to DB to get Info->a
        //communicated with other apps to get some data from external sources->b
        // using a and b create object inside constructor
        list = new ArrayList<>();
        list.add("A");
        list.add("B");
        System.out.println("Doing complex operation");
    }
    public void readData(){
        System.out.println(list);
        System.out.println("Logic for reading data is being executed");
    }
}
