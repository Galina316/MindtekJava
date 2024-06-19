package collectionsforstreams;

import java.util.HashSet;
import java.util.Set;

public class IntroHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(55);
        set.add(66);
        set.add(67);
        set.remove(66);
        System.out.println(set);

    }
}
