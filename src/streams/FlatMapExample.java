package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfList = new ArrayList<>();
        List<Integer> list1= List.of(4,5,1);
        List<Integer> list2 = List.of(3,2);
        listOfList.add(list1);
        listOfList.add(list2);

       List<Integer> nums= listOfList.stream()
                .flatMap(list->list.stream())
               .sorted()
                .collect(Collectors.toList());

        System.out.println(nums);


        List<Integer> nums2 = new ArrayList<>();
        listOfList.stream()
                .forEach(x->x.stream().forEach(num -> nums2.add(num)));
        System.out.println(nums2);

        String[]value = {"Today I have","learned streams","and different operations"};
        // convert to convert every word separate  each word

        List<String> words =Arrays.stream(value)
                .flatMap(el ->Arrays.stream(el.split(" ")))
                .collect(Collectors.toList());
        System.out.println(words);







    }
}
