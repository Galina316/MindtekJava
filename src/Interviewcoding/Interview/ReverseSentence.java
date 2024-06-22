package Interviewcoding.Interview;

public class ReverseSentence {
    //Write a code that will reverse sentence.
    // String str=”String is immutable”;
    // output: “immutable is String“;
public static String reverseSentence(String str){
    String []words = str.split(" ");
    StringBuilder rev = new StringBuilder();
    for(int i = words.length-1;i>=0;i--){
        rev.append(words[i]);
        if(i>0){
            rev.append(" ");
        }
    }return rev.toString().trim();
}

    public static void main(String[] args) {
        System.out.println(reverseSentence("I Love Java"));
    }
}
