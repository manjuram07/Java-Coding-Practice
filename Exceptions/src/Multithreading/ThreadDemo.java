package Multithreading;


class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run () {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread is running: "+i);
        }
    }

    public void run (String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread is running: with name: "+name);
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("count threads : "+ Thread.activeCount()); // it counts the current thread running


        MyThread t1 = new MyThread("Payment-thread");
        t1.start();

        System.out.println("check thread : "+ t1.isAlive()); // it checks thread is running or not

        Thread.sleep(5000); // it pauses the thread temporarily by given time

        t1.join(); // a thread waits until completing of other thread.



//        t1.start(); // This will throw an IrllegalThreadStateException because a thread cannot be started more than once.


        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread is running: "+i);
        }
    }
}
