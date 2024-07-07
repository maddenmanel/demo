package designerpattern;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicLong;

public class SlideWindow {
    private AtomicLong counter = new AtomicLong();
    private LinkedList<Long> solts = new LinkedList<>();
    private volatile boolean limit = false;
    private volatile boolean status = false;

    public SlideWindow(int qps) {
        new Thread(() -> {
            while (status) {
                solts.add(counter.get());
            }
            if(solts.size() > 100) {
                solts.removeFirst();
            }
            if (solts.getLast() - solts.getFirst() + 1 > qps){
                limit = true;
            } else {
                limit = false;
            }
            try{
                Thread.sleep(10L);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    public boolean check() {
        counter.incrementAndGet();
        return !limit;
    }

    private void stop() {
        status = false;
    }

    public static void main(String[] args) throws InterruptedException {
        SlideWindow slideWindow = new SlideWindow(7);
        Thread.sleep(100L);
        for (int i = 0; i < 10; i++) {
            if (slideWindow.check()){
                System.out.println(System.currentTimeMillis() + ":正常运行");
            } else {
                System.out.println("被限流了");
            }
            Thread.sleep(50L);
        }
        slideWindow.stop();

    }


}
