package StringBuilder;

public class StrtoStb {
    public static void main(String[] args) {
        String str = "John";
        StringBuilder stb = new StringBuilder(str);
        //stringbuilder to string
        String str2 = stb.toString();
        String word ="Sun";
        System.out.println(new StringBuilder(word.toLowerCase()).reverse());


    }
}
