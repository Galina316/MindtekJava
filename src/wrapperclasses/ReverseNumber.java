package wrapperclasses;

public class ReverseNumber {
    public static void main(String[] args) {

        int number = -123;
        // convert to Stb use reverse method and convert to int
         StringBuilder stb = new StringBuilder(number+"");
         stb.reverse();
         if(stb.toString().contains("-")){
             number = Integer.parseInt(stb.toString().substring(0,stb.length()-1))*-1;
         }else
         number=Integer.parseInt(stb.toString());
        System.out.println(number);
    }
}
