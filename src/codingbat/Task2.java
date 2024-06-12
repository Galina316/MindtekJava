package codingbat;

public class Task2 {
    //Given a string, if one or both of the first 2 chars is 'x',
    // return the string without those 'x' chars, and otherwise
    // return the string unchanged. This is a little harder than it looks.
    public static void main(String[] args) {
        String word = "xasd";
        if(word.length()<2)word="";
        if(word.charAt(0)=='x'|| word.charAt(1)=='x') word = word.replaceFirst("x","");
        if(word.charAt(0)=='x'|| word.charAt(1)=='x') word = word.replaceFirst("x","");
        System.out.println(word);

    }
}
