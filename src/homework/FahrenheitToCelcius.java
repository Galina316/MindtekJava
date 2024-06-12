package homework;

import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.BoldAction;
import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        double fahrenheit =  input.nextDouble();
        System.out.println("It is "+ ((fahrenheit-32)*5/9) + "in Celsius" );








    }
}
