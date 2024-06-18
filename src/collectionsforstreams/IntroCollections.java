package collectionsforstreams;

import java.util.ArrayList;
import java.util.Stack;

public class IntroCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();
        System.out.println(stack);
        // add -> push
        stack.push(5);
        stack.push(7);
        stack.push(2);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        stack.isEmpty();
        System.out.println(stack);


        Stack<String> words = new Stack<>();
        if(!words.isEmpty())words.pop();



    }

}
