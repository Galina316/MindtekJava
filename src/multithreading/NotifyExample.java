package multithreading;

public class NotifyExample {
    static Object lock = new Object();
        static boolean flag = false;

        public static void main(String[] args) throws InterruptedException {
            Thread producer = new Thread(() -> {
                synchronized (lock) {
                    System.out.println("Producer: Producing...");
                    flag = true;
                    lock.notifyAll(); // Notify waiting threads
                }
            });

            Thread consumer = new Thread(() -> {
                synchronized (lock) {
                    while (!flag) {
                        try {
                            System.out.println("Consumer: Waiting...");
                            lock.wait(); // Wait until notified
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Consumer: Consuming...");
                }
            });

            consumer.start();
            Thread.sleep(1000); // Ensure consumer starts waiting first
            producer.start();

            consumer.join();
            producer.join();
        }
    }



