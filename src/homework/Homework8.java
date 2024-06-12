package homework;

public class Homework8 {
    public static void main(String[] args) {
        //1. Create a class with main method
        //2. Create below String variable
        //     String info="David,SDET,Chicago";
        //3. Applying String methods to info variable print output like below:
        //DAVID
        //SDET
        //CHICAGO

        String full = "David,SDET,Chicago";
        System.out.println(full.toUpperCase().substring(0,full.indexOf(",")));
        System.out.println(full.toUpperCase().substring (full.indexOf("S"),10));
        System.out.println(full.toUpperCase().substring (full.indexOf("C"),18));
    }
}
