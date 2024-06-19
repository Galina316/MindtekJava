package collectionsforstreams;

import java.util.HashSet;
import java.util.Set;

public class PetMain {
    public static void main(String[] args) {
        Pet catLeo = new Pet("Leo","cat",3);
       // Pet dogLayka = new Pet("Layaka","dog",5);
        Pet cat = new Pet("Leo","cat",3);

        boolean areSame= catLeo==cat;
        boolean same = catLeo.equals(cat);
        System.out.println(same);
        System.out.println(areSame);
        System.out.println(catLeo.hashCode());
        System.out.println(cat.hashCode());

        Set<Pet> pets = new HashSet<>();
        pets.add(catLeo);
        pets.add(cat);
        System.out.println(pets);


    }
}
