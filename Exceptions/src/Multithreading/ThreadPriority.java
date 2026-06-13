package Multithreading;

class customThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child Thread " + i);
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) throws InterruptedException {
        customThread t = new customThread();
        t.setPriority(10); // Setting child thread to Max Priority [24]
        t.start();
        t.join();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread " + i); // Main thread priority is 5 [24]
        }
        // Theoretically, the Child Thread should complete its 10 iterations first [24, 25]
    }
}
