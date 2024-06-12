package wrapperclasses;

public class Boxing {
    public static void main(String[] args) {
        //Autoboxing
        int num = 5;
        // convert Primitive to a Wrapper
        Integer numWrapper = num;

        //UNBOXING
        Integer number = 10;
        //Wrapper to Primitives
        int numberPrimitive = number;

        String str = "54890";
        int strNum = Integer.parseInt(str);
        System.out.println(str+10);

        String value = "123";
        int strValue = Integer.parseInt(value);
        int strValue1 = Integer.valueOf(value);



    }
}
