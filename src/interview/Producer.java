package interview;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    protected BlockingQueue<Object> queue;

    public Producer(BlockingQueue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                Object justProduced = getResource();
                queue.put(justProduced);
                System.out.println("Produced resource - Quenue size now =" + justProduced);
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted");
            }
        }
    }

    private Object getResource() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Producer thread interrupted");
        }
        return new Object();
    }
}
