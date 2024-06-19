package collectionsforstreams;

import java.util.LinkedList;
import java.util.Queue;

public class IntroQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(55);
        queue.offer(57);
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue);
    }
}
