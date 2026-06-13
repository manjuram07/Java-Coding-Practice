package Multithreading;

class Counter {

    int count = 0;

    void increment() {

        count++;
    }
}

class MyThread1 extends Thread {

    Counter c;

    MyThread1(Counter c) {
        this.c = c;
    }

    public void run() {

        for (int i = 0; i < 1000; i++) {

            c.increment();
        }
    }
}

class RaceCondition {

    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        MyThread1 t1 = new MyThread1(c);
        MyThread1 t2 = new MyThread1(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
