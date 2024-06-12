package functionalinterfaces3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsIntro {
    public static void main(String[] args) {
        List<Integer>numbers = List.of(4,1,5,8,1,5,3,16);
          List<Integer> output = numbers.stream().filter(x-> x>0 && x<5).collect(Collectors.toList());
        System.out.println(output);
        long count = numbers.stream().filter(x->x%2==1).count();

        System.out.println("numbers of Odd numbers "+count);


        List <Integer> uniq= numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(uniq);

       boolean anyMatch = numbers.stream().anyMatch(x->x>10 && x<20);
        System.out.println(anyMatch);

        boolean allMatch = numbers.stream().allMatch(x-> x>0 && x<10);
        System.out.println(allMatch);

        String []names ={"John","Patel","Bob","Charlie"};
        List<String> nameWithA = Arrays.stream(names).filter(x->x.contains("a")|| x.contains("A")).collect(Collectors.toList());
        System.out.println(nameWithA);
    }
}
