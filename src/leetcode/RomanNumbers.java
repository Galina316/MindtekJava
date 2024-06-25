package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {
    public static void main(String[] args) {
        System.out.println(romanToInt("V"));

    }



    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();


        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);


        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            // Get value of current symbol
            int currentValue = romanValues.get(s.charAt(i));

            // Check if we need to subtract (e.g., IV -> 4, IX -> 9)
            if (i + 1 < s.length()) {
                int nextValue = romanValues.get(s.charAt(i + 1));
                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }}
