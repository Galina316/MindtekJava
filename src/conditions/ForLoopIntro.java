package conditions;

public class ForLoopIntro {
    public static void main(String[] args) {
        // print numbers from 1 to 10
  //      int i = 1;
  //      while (i <= 10) {
  //          System.out.println(i);
  //          i++;
    //    }
        // for (start;condition; inc logic){code}
    for(int i =1;i<=10;i++){
        if(i<5)continue;
        System.out.println(i);
        if(i==7)break;
    }
}}