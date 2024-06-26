package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SortPeople {

    public static String[] sortPeople(String[] names, int[] heights){
        Map<Integer,String > map = new TreeMap<>();
        for(int i=0;i<names.length;i++)map.put(heights[i],names[i]);
        String[]res = new String[names.length];
        int index = res.length-1;
        for(String n :map.values()) {
            res[index] = n;
            index--;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortPeople(new String[]{"John","Mary","Lola"},new int[]{155,180,175})));
    }
}
