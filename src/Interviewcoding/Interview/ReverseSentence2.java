package Interviewcoding.Interview;

public class ReverseSentence2 {
   public static String reversedSentence2(String str){
       String []words= str.split(" ");
       String res = " ";
       for(int i = words.length-1;i>=0;i--){
           res+=words[i];
           if(i>0){
               res+=" ";
           }
       }
       return res.toString().trim();
   }

    public static void main(String[] args) {
        System.out.println(reversedSentence2("I Love java"));
    }
}
