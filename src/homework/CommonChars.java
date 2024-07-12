package homework;

import java.util.Arrays;

public class CommonChars {
    //Write a method that accepts two Strings as a parameters and returns common characters.
    //
    //Example:
    //.commonChars("Code", "Mode");  returns "ode";
    //.commonChars("Bunny", "Sun");  returns "un";
    //.commonChars("Hot", "Cold");  returns "o";

    public static String getCommonChar(String str1, String str2) {
            // Convert both strings to lowercase to ensure case-insensitive comparison
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                int index = str2.indexOf(c);
                if (index >= 0) {
                    result.append(c);
                    str2 = str2.substring(0, index) + str2.substring(index + 1);
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            System.out.println(CommonChars.getCommonChar("Hot", "Cold"));
        }


    }

