package StringBuilder;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "Java is easy";
        // reverse each word in sentense;
        // convert string to stringbuilder

        StringBuilder stb = new StringBuilder(str);
        stb.reverse();
        System.out.println(stb);
        StringBuilder output = new StringBuilder();
        while(stb.lastIndexOf(" ")!=-1){
            output.append(stb.substring(stb.lastIndexOf(" ")+1)).append(" ");
            stb.delete(stb.lastIndexOf(" "),stb.length());
        }
        System.out.println(output.append(stb));


    }
}
