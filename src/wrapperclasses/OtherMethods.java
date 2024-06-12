package wrapperclasses;

public class OtherMethods {
    public static void main(String[] args) {
        Character c = 'a';
        System.out.println(Character.isLetter('a'));
        char letter = 'a';
        if ((letter>=65&&letter<90)||(letter>97&&letter<=122)){
            System.out.println("it is letter");
        }
        System.out.println(Character.isDigit('1'));
        System.out.println(Boolean.parseBoolean("True"));
    }
}
