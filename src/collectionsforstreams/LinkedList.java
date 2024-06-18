package collectionsforstreams;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        List<Integer>list2= new java.util.LinkedList<>();
        list2.add(4);
        list2.add(5);
        list2.add(1,8);
        for(int el : list1)list2.add(el);
        System.out.println(list2);
        System.out.println(list2);


    }
}
