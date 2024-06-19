package collectionsforstreams;

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

    }
}
