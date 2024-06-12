package string;

public class Task9 {
    public static void main(String[] args) {
        // assume we captured full name of person from some console
        String fullName = "Jack Smith";
        // task: print first name and last name separately
        //int index = fullName.indexOf(4);
        //String firstName = fullName.substring(0,4);
       // System.out.println(firstName);
        //String lastName =fullName.substring(5);
        //System.out.println(lastName);
        System.out.println("First name: "+fullName.substring(0,fullName.indexOf(" ")));
        System.out.println("Last name: " +fullName.substring(fullName.indexOf(" ")).trim());
    }
}
