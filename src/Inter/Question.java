package Inter;

public class Question {
    //Write a code that will reverse sentence. String str=”String is immutable”; output: “immutable is String“;
     public static String  reverseSentence(String str){
         String [] words = str.split(" ");
         String res =" ";
         for(int i= words.length-1;i>=0;i--){
             res+=words[i];
             res += " ";

         }
         return res.trim();
     }

    public static void main(String[] args) {
        String s =" I Love Java";
        System.out.println(reverseSentence(s));
    }
}
