package interview;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintThreadCycle {
    private final Lock lock = new ReentrantLock();
    private final Condition condition1 = lock.newCondition();
    private final Condition condition2 = lock.newCondition();
    private final Condition condition3 = lock.newCondition();
    private int flag = 1;

    void printA() {
        lock.lock();
            try {
                while (flag != 1) {
                    condition1.wait();
                }
                System.out.println("a");
                flag = 2;
                condition1.signalAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
        }
    }

    void printB() {
        lock.lock();
        try {
            while (flag != 2) {
                condition1.wait();
            }
            System.out.println("b");
            flag = 3;
            condition2.signalAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void printC() {
        lock.lock();
        try {
            while (flag != 3) {
                condition1.wait();
            }
            System.out.println("c");
            flag = 1;
            condition3.signalAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        PrintThreadCycle main = new PrintThreadCycle();
        for (int i = 0; i < 30; i++) {
            new Thread(main::printA).start();
            new Thread(main::printB).start();
            new Thread(main::printC).start();
        }
    }

}
