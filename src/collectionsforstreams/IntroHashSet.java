package collectionsforstreams;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class IntroHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(55);
        set.add(66);
        set.add(67);
        set.remove(66);
        System.out.println(set);
        System.out.println("=================");
        System.out.println("                 ");

        Set<String> treSet = new TreeSet<>();
        treSet.add("Java");
        treSet.add("Apple");
        treSet.add("Zebra");
        System.out.println(treSet);



    }
}
