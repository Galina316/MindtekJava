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
                .filter(x->x.getAge()>30 )
                .collect(Collectors.toList());
        System.out.println("People older than 30 yo: "+olderThan30);

        List<String> names = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("Names of all people: "+names);

        List<String>cities = persons.stream()
                .flatMap(x->x.getAddresses().stream())
                .map(Address::getCity)
                .collect(Collectors.toList());
        System.out.println("List of cities: "+cities);

        int uniqueCountries = (int) persons.stream()
                .flatMap(x->x.getAddresses().stream())
                .map(Address::getCountry)
                .distinct()
                .count();
        System.out.println("Number of unique countries: "+uniqueCountries);


    }

}
