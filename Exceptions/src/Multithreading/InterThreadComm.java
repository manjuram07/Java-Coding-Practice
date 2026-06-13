package Multithreading;

class Shared {

    synchronized void test() throws InterruptedException {

        System.out.println("Waiting...");

        wait();

        System.out.println("Resumed...");
    }

    synchronized void notifyThread() {

        System.out.println("Notify called");

        notify();
    }
}

public class InterThreadComm {

    public static void main(String[] args) {

        Shared s = new Shared();

        Thread t1 = new Thread(() -> {

            try {

                s.test();

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {

            try {

                Thread.sleep(3000);

                s.notifyThread();

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}
