package string;

public class StringMethod2 {
    public static void main(String[] args) {

        String word = "programming";
        //substring:
       // String  text = word.substring(0,7);
        String text = word.substring(4);
        System.out.println(text);
        //replace:
        System.out.println(word.replace('g','G'));
        System.out.println(word);
    }
}
