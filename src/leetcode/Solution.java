package leetcode;

import java.util.Stack;

public class Solution {
    //if opening then put into stack
    //else get the el from stack and check types
       // if types match then continue
       // else return false

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length();i++) {
            char par = s.charAt(i);
            if(par=='(' || par=='[' || par=='{')stack.push(par);
            else {
                if(stack.isEmpty())return false;
               char el = stack.pop();
               if(par ==')'&& el!='('|| par==']'&&el!='['||par=='}'&& el !='{' ) return false;
            }
        }

        return stack.isEmpty();

    }
}
