package topics;

public class TestThread {
    public static void main(String[] args) {
        System.out.println("Thread 1: ");
        MultiThread thread1 = new MultiThread();
        Thread t1 = new Thread(thread1);
        t1.start();

        System.out.println("Thread 2: ");
        MultiThread thread2 = new MultiThread();
        Thread t2 = new Thread(thread2);
        t2.start();
    }
}
