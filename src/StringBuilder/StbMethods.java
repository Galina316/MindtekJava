package StringBuilder;

public class StbMethods {
    public static void main(String[] args) {


    StringBuilder stb = new StringBuilder("Computer");
    // .append() is adding
        stb.insert(0,"Apple");
        System.out.println(stb);
        //Apple computer apple computer
        stb.insert(5," - ");
        System.out.println(stb);
        stb.reverse();
        System.out.println(stb);

        stb.reverse();

        stb.deleteCharAt(6);
        System.out.println(stb);

        //apple computer -computer

        stb.delete(0,5);
        System.out.println(stb);


        stb.replace(0,1,"c");

}
}
