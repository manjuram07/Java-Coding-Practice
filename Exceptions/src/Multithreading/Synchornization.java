package Multithreading;

class Table {

    synchronized void printTable6(int n) throws InterruptedException {

        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            Thread.sleep(400);
        }
    }

    public void printTable100(int n) throws InterruptedException {

        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
//            Thread.sleep(400);
        }
    }
}


class myThread10 extends Thread {
    Table t;

    myThread10(Table t) {
        this.t = t;
    }

    public void run() {
        try {
            t.printTable6(6);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class myThread20 extends Thread {
    Table t;

    myThread20(Table t) {
        this.t = t;
    }

    public void run() {
        try {
            t.printTable100(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Synchornization {

    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();
        myThread10 thread1 = new myThread10(table);
        myThread20 thread2 = new myThread20(table);

        thread1.start();
        thread1.join();
        thread2.start();
    }
}
