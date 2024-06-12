package methods;

public class HelpfulMethods {
    public double fehToCelsius(int fehrenheit){
        //(F - 32)*5/9
        return (fehrenheit-32.0)*5/9;
    }

    public static void main(String[] args) {
        // create object
        HelpfulMethods methods = new HelpfulMethods();
        System.out.println(methods.fehToCelsius(80));
        System.out.println(methods.lastTwoChars( "Java"));
        System.out.println(methods.lastTwoChars("Programming"));
        System.out.println(methods.canEvenlyDivide(4,2));
    }
    public String lastTwoChars(String str){
        if(str.length()>=2){
        int index = str.length()-2;
        return str.substring(index);
        }
        return null;
    }

    public boolean canEvenlyDivide(int num1, int num2){
      return  num1%num2==0;
    }



}
