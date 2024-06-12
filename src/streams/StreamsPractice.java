package streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
    public static void main(String[] args) {
        List<String> colors = List.of("Red","Blue","White","Black","Green","Pink");
        Stream<String> stream = colors.stream();
        Stream<String> sortedColors =stream
                .filter(color->color.startsWith("B"))
                .sorted();

        List<String>output =sortedColors.filter(color->color.contains("a"))// Stream<Strings>
                .collect(Collectors.toList());//List<String>
        System.out.println(output);


       List<Integer> length =  colors.stream()
                .map(color -> color.length())
                .collect(Collectors.toList());
        System.out.println(length);

       boolean result = colors.stream()
                .filter(color-> color.length()==5)
                .anyMatch(color -> color.toLowerCase().contains("b"));
        System.out.println(result);

        boolean result2 = colors.stream()
                .filter(x->x.length()==4)
                .noneMatch(x->x.toLowerCase().contains("b"));
        System.out.println(result2);


       Integer max = colors.stream()
                .map(String::length)
                .max(Integer::compareTo).get();
        System.out.println("Maximum length: "+max);

        Integer min = colors.stream()
                .map(x->x.length())
                .min(Integer::compareTo).get();//
        System.out.println("Minimum length: "+ min);

        colors.forEach(System.out::println);

    }
}
