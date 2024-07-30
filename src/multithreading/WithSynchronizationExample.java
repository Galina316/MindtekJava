package multithreading;


import java.util.ArrayList;

public class WithSynchronizationExample {
        static ArrayList<Integer> list = new ArrayList<>();
        static Object lock = new Object(); // Object used for synchronization

        public static void main(String[] args) throws InterruptedException {
            Thread thread1 = new Thread(() -> {
                synchronized (lock) {
                    for (int i = 0; i < 1000; i++) {
                        list.add(i);
                    }
                }
            });

            Thread thread2 = new Thread(() -> {
                synchronized (lock) {
                    for (int i = 0; i < 1000; i++) {
                        list.add(i);
                    }
                }
            });

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();

            // No race condition: size should always be 2000 due to synchronized

            System.out.println("Size of list (with synchronization): " +
                    list.size());
        }
    }
