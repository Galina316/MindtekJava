package objects;

public class Student {
    // Attributes/Instance Variables/Fields
    // Methods/Actions


    String name;
    int id;
    String locations;

    public String study(){
        return name+" is studying.";

    }

    public String attendingClass() {
        return name+" is attending class from "+locations;
    }
}
