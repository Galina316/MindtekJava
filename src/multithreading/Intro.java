package multithreading;

public class Intro {
    // Single thread : only one thread in app
    // Multithreading : multiply actions simultaneously

    public static void main(String[] args) {
        System.out.println("Started");
        NumberPrinter thread = new NumberPrinter("ThOne");
        thread.start();
        System.out.println("ThOne"+thread.getPriority());

        for(int i= 0;i<5;i++) System.out.println("main ->"+i);


        NumberPrinter thread2 = new NumberPrinter("ThTwo");
        thread2.start();

        MyThread thread0 = new MyThread();
        thread0.run();
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous implementation");
            }
        };
        // myRunnable.run();->run method executed like standard method

        Thread thrObject1 = new Thread(myRunnable);
        thrObject1.start();
        //lambda
        Runnable runnable =()->{
            System.out.println("Lambda");
        };
        runnable.run();
        Thread thrObject2 = new Thread(runnable);
        thrObject2.start();
    }

    // ways to create thread objects:
    // 1 extend Thread class
    //2 implement Runnable interface
    // 3 Anonymous implementation
    // 4 Lambda function


}
