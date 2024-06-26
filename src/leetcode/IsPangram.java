package leetcode;

import java.util.HashSet;

public class IsPangram {
    public static boolean isPangram(String sentence){
        HashSet<Character> l = new HashSet<>();
        for(char c : sentence.toCharArray()){
            if(Character.isLetter(c)){
                l.add(c);
            }
            if(l.size()==26){
                return true;
            }
        }
        return l.size()==26;
    }
    public static boolean isPangram2(String sentence){
        for(int i = 97;i<123;i++)
            if(sentence.indexOf((char)i)==-1)return false;
        return true;
    }
}
