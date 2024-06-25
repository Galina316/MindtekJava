package collectionsforstreams;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {
            // key and value
        //key must be unique
        //initial capacity of map is 16 bucket
        //hash collision: when in one single bucket many objects are stored
        //map uses hashcode method metod -x and divide with 16, uses its reminder to determine a bucket where these objects are going to be stored
        //equals method is used to find correct object from a bucket
        //till 8 objects hashmap utilized linked list to store objects for 8+ it is utilizing binary tree , cuz binary tree is much efficient than linked list



        Map<Integer,String> days = new HashMap<>();// if u want sorted then can write TreeMap instead HashMap
        //add elements
        days.put(3,"Wednesday");
        days.put(2,"Tuesday");
        days.put(7,"Sunday");
        days.put(5,"Friday");
        System.out.println(days);// storing in random way

        //get el from HashMap
        days.get(5);
        System.out.println(days.get(5));


        // remove object el
        days.remove(5);
        System.out.println(days);

        days.containsKey(3);
        days.getOrDefault(7,"Seven");
        days.putIfAbsent(12,"twelve");
        System.out.println(days);

        //iterate through map
        for(Map.Entry<Integer,String> pair:days.entrySet()){
            System.out.println(pair.getKey());
            System.out.println(pair.getValue());
            System.out.println("===========");
        }
        System.out.println("==========");
        days.forEach((a,b)->System.out.println(a +" "+b));
        days.forEach((k,v)-> System.out.println(k+ "-> "+v));

    }
}
