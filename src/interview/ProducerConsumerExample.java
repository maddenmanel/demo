package interview;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerExample {
    public static void main(String[] args) throws InterruptedException {
        int numProducers = 20;
        int numConsumers = 1;

        BlockingQueue<Object> queue = new LinkedBlockingQueue<>(20);

        for (int i = 0; i < numProducers; i++) {
            new Thread(new Producer(queue)).start();
        }

        for (int i = 0; i < numConsumers; i++) {
            new Thread(new Consumer(queue)).start();
        }

        Thread.sleep(10 * 1000);

        System.exit(0);
    }
}
