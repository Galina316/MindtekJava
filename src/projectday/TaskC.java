package projectday;

public class TaskC {
    public static void main(String[] args) {
        int a=11;
        int b=12;
        int c=10;
        boolean answer1 = ++a==b--;
        boolean answer2 = ++c>--b;
        boolean answer3 =b--<c++&&a++>++c;
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println("Total is "+ (--a+(b+c)));


    }
}
