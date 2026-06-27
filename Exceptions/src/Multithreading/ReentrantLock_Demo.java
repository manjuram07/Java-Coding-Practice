package Multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_Demo {

    static void method(){
        System.out.println("this user method.");
    }

    public static void main(String[] args) throws InterruptedException {

        ReentrantLock lock = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            lock.lock();
            try {
                System.out.println("Thread 1 acquired the lock");
                // Simulate some work with the lock held
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } finally {
                lock.unlock();
                System.out.println("Thread 1 released the lock");
                method();
            }
        });

        Thread t2 = new Thread(() -> {
            lock.lock();
            try {
                System.out.println("Thread 2 acquired the lock");
                // Simulate some work with the lock held
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println("Thread 2 released the lock");
            }
        });

        t1.start();
        Thread.sleep(2000); // Ensure t1 starts first
        t2.start();
    }
}
