package methods2;

public class StaticMethods2 {
    public static int getGreatest (int num1,int num2){
        return num1>num2? num1: num2;
    }

    public static void main(String[] args) {
        System.out.println(StaticMethods2.getGreatest(5,2));
    }
}
