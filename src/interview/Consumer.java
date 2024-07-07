package interview;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    protected BlockingQueue<Object> queue;
    public Consumer(BlockingQueue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            Object obj = null;
            try {
                obj = queue.take();
            } catch (InterruptedException e) {
                take(obj);
            }
            System.out.println("Consumer resource - Quenue size now = : " + obj);
        }

    }

    private void take(Object obj) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Consumer read Interrupted");
        }
        System.out.println("Consuming object : " + obj);
    }
}
