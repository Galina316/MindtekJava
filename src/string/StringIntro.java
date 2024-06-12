package string;

public class StringIntro {
    public static void main(String[] args) {
        //ref variables may have methods
        // to use methods: varName.
        String text ="java";//JAVA
        System.out.println(text.toUpperCase());
        System.out.println(text);
        System.out.println("MINDTEK".toLowerCase());
        int size = text.length();
        System.out.println(text.length());
        //return: brings bacj to the caller
        //caller is code from where the method is being called

        //Structure of String variables:
        //"java"
        // 0123
        //first index: 0
        // last index:word.length()-1
        System.out.println(text.charAt(0));

    }
}
