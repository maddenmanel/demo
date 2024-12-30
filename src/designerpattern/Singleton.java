package designerpattern;

public class Singleton {
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

// 饿汉式
class SingletonEager{
    private static final SingletonEager instance = new SingletonEager();
    private SingletonEager() {
    }
    public static SingletonEager getInstance() {
        return instance;
    }
}

// 懒汉式
class SingletonLazy{
    private static SingletonLazy instance;
    private SingletonLazy() {
    }
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}

// 双重检查
class SingletonDoubleCheck{
    private static volatile SingletonDoubleCheck instance;
    private SingletonDoubleCheck() {
    }
    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}

// 加锁
class SingletonLock{
    private static SingletonLock instance = null;
    private SingletonLock() {
    }
    public static synchronized SingletonLock getInstance() {
        if (instance == null) {
            instance = new SingletonLock();
        }
        return instance;
    }
}


