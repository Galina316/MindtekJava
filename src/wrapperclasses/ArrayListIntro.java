package wrapperclasses;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //ArrayList is resizable
        String [] array = new String[6]; //Array is fixed size
        list.add("Java");
        list.add("Python");
        list.add("Javascript");
        list.add("C#");
        list.add("C++");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());
        list.set(2,"Typescript");
        System.out.println(list);
        list.add(1,"Javascript");
        System.out.println(list);
        for (String str : list){
            System.out.println(str);
        }
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
