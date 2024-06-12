package arrays2;

public class ReverseSentence {
    public static void main(String[] args) {


        String sentence = "I love java";
        String reversed ="";
        // Java love I
        String[] word = sentence.split(" ");
        for (int i = word.length-1; i>=0;i--){
            reversed = reversed+word[i]+" ";
        }
        System.out.println(reversed.trim());
    }
}
