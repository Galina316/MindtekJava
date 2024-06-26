package collectionsforstreams;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapIntro {
    public static void main(String[] args) {
        Map<Integer,String>map = new TreeMap<>();
        map.put(5,"Jack");
        map.put(2,"Jenny");
        map.put(45,"Brad");
        System.out.println(map);
    }
}
