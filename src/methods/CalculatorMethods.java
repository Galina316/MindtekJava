package methods;

public class CalculatorMethods {
    public double getSum(double num1,double num2){
        //int sum = num1+num2;
        return num1+num2;
    }
    public double multiply (double num1,double num2){

        return num1*num2;
    }

    public static void main(String[] args) {
        // creating object
        CalculatorMethods methods = new CalculatorMethods();
        System.out.println(methods.getSum(2,3));
        System.out.println(methods.getSum(1200,354));
        System.out.println(methods.multiply(1200,354));
        System.out.println(methods.multiply(2000,0.6));
    }
}

