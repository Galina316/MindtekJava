package arraylist;

import java.util.ArrayList;
import java.util.List;

public class BasicList {
    public static void main(String[] args) {
        // List data type is Object
        List list = new ArrayList<>();
        list.add("John");
        list.add(123);
        list.add(2.55);
        list.add(true);
        list.add('b');
        System.out.println(list);

        list.set(0,"Patel");
        //list.remove(4);
        list.remove(new Character('b'));
        System.out.println(list);


        list.set(0,"Ptel");
        System.out.println(list);
        System.out.println("Index of Ptel: "+list.indexOf("Ptel"));
        List sublist = list.subList(1,3);
        list.subList(1,3);
        System.out.println(sublist);
        list.clear();
        System.out.println(list.isEmpty());
    }
}
