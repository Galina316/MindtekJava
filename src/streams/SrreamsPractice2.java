package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SrreamsPractice2 {
    public static void main(String[] args) {
        Parent parent1 = new Parent("John Doe",'M',new ArrayList<>(List.of("Bob","Richard","Michael")));
        Parent parent2 = new Parent("Patel Harsh",'M',new ArrayList<>(List.of("Srikkanath","Sumathi","Suresh")));
        Parent parent3 = new Parent("Kate Peterson",'F',new ArrayList<>(List.of("Jessica","Charles")));

        List<Parent> parents = List.of(parent1,parent2,parent3);


        /*
        Store names of children in list of Strings
        then get first kid of every M parent

         */

        List<String> children = parents.stream()
                .flatMap(x->x.getChildren().stream())
                .collect(Collectors.toList());

        System.out.println(children);

        List<String>firstKidOfMParents= parents.stream()
                .filter(x->x.getGender()=='M')
                .flatMap(x-> List.of(x.getChildren().get(0)).stream())
                .collect(Collectors.toList());

        System.out.println(firstKidOfMParents);

        // get parent  First name who has children start with letter C

        List<String> childrenWithLetterC =  parents.stream()
                .filter(x->x.getChildren().stream().filter(ch->ch.startsWith("C")).count()>=1)
                .map(x->x.getName().substring(0,x.getName().indexOf(" ")))
                .collect(Collectors.toList());

        System.out.println(childrenWithLetterC);


    }
}
