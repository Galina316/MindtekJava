package homework1.many;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonPractice {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John", 28, Arrays.asList(new Address("New York", "USA"), new Address("Boston", "USA"))),
                new Person("Jane", 22, Arrays.asList(new Address("London", "UK"), new Address("Manchester", "UK"))),
                new Person("Alice", 35, Arrays.asList(new Address("Sydney", "Australia"))),
                new Person("Bob", 40, Arrays.asList(new Address("Paris", "France"), new Address("Lyon", "France"))));

        /*
        3. Complete below tasks:
Filter people older than 30 years.
Collect the names of all people into a list.
Flatten the list of addresses into a list of cities.
Count the number of unique countries in the list of addresses.
         */

        List<Person> olderThan30=persons.stream()
               // .flatMap(List::streams)
                .filter(x->x.getAge()>30 )
               // .flatMap(x->(List<String>x.getName()))
                .collect(Collectors.toList());


    }

}
