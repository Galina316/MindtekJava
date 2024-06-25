package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            charCount[t.charAt(i) - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean isAnagram1(String s, String t) {
        //if lenghts are not equal then it  is not anagram
        if(s.length()!=t.length()) return false;

        Map<Character,Integer> map = new HashMap<>();
        // fill up letters from s into the map
        for(int i = 0;i<s.length();i++){
            char letter = s.charAt(i);
           if(map.containsKey(letter)) map.put(letter,map.get(letter)+1);
           else map.put(letter,1);
        }
        for(int i=0;i<t.length();i++){
            char letter = t.charAt(i);
            if(!map.containsKey(letter))return false;
            else{
                if(map.get(letter)==0)return false;
                map.put(letter,map.get(letter)-1);
            }
        }
        return true;


    }
    public static boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[]letters = new int[26];
        for(int i=0;i<s.length();i++){
            letters['z'-s.charAt(i)]++;
            letters['z'-t.charAt(i)]--;
        }
        for(int el: letters)if(el!=0)return false;
        return true;
    }


    public static void main(String[] args) {

        System.out.println(isAnagram1("aacd","cdaa"));
    }
}

