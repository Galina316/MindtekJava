package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SpecificList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(16);
        list.add(24);
        list.add(33);
        //list.add(null);
        // print sum of odd Numbers


        int sum = 0;

        for(int i =0;i<list.size();i++){
            if(list.get(i)%2==1)sum+=list.get(i);


        }System.out.println(sum);
        list.add(10);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

    }
}
