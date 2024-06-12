package homework;

import java.util.Arrays;

public class CommonChars {
    //Write a method that accepts two Strings as a parameters and returns common characters.
    //
    //Example:
    //.commonChars("Code", "Mode");  returns "ode";
    //.commonChars("Bunny", "Sun");  returns "un";
    //.commonChars("Hot", "Cold");  returns "o";

    public static String getCommonChar(String str1,String str2){
        StringBuilder common = new StringBuilder();
        String r = "";

        for(int i =0; i<str1.length();i++ ){
            char c = str1.charAt(i);
            for(int j = 0 ;j<str2.length();j++){
                char b =str2.charAt(j);
                if(c==b){
                    c++;
                    common.append(c);

                }


            }
        } return common.toString();

    }

    public static void main(String[] args) {
        System.out.println(CommonChars.getCommonChar("Code","Mode"));
    }


}
