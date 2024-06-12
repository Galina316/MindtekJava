package variables;

public class VariableMath {
    public static void main(String[] args) {
        // operation: + - * / %
        System.out.println("start");

        // +
        int num1 = 5, num2 = 8;
        int sum = num1 + num2;
        System.out.println(sum);
        int minus = num1-num2;
        System.out.println(minus);
        int multi = num1 * num2;
        System.out.println(multi);
        // cast num2 to double, convert int num2 into double
        double div = (double)num2/3;
       System.out.println(div);
        System.out.println("-------");
        // % -> remainder
        int num = 100;
        // a % b -> find remainder from division of a/b
        int reminder = num%95;
        System.out.println(reminder);
    }
}
