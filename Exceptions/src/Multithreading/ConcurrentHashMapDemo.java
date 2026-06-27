package Multithreading;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                map.put(i, "Value " + i);
                System.out.println(Thread.currentThread().getName() + " added: " + i);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();
    }
}
