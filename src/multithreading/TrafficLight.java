package multithreading;

import java.awt.*;

import static java.awt.Color.*;

public class TrafficLight {
    private Color color;

    private static volatile Color previous = ORANGE;

    public void TrafficSignal(Color color) {
        this.color = color;
    }

    public synchronized void display() throws InterruptedException {
        if (color.equals(RED)) {
            while (previous != ORANGE) wait();
        } else if (color.equals(ORANGE)) {
            while (previous != GREEN) wait();
        } else if (color.equals(GREEN)) {
            while (previous != RED) wait();
        }

        System.out.println(this.color);
        Thread.sleep(1000);
        previous = color;
        notifyAll();
    }


    public void run() {
        while (true) {
            try {
                display();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
