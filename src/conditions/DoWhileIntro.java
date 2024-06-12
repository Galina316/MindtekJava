package conditions;

public class DoWhileIntro {
    public static void main(String[] args) {
        // do{} while(condition)
        // print numbers from1 to 5
        int num = 1;// first check condition then execute the code
        //while(num<=5){
           // System.out.println(num);
        // first execute the code at least one time then check the condition
        do{
            System.out.println(num);
            num++;
        }while(num<=5);
        }
    }
//}
