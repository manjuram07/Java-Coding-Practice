package Multithreading;

public class ThreadSchedulerDemo {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println("Current thread: " + t.getName());
        System.out.println("Current thread priority: " + t.getPriority());
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Current thread priority after change: " + t.getPriority());
        System.out.println("Current thread state: " + t.getState());
        t.setName("Raaam");
        System.out.println("Thread name : " + t.getName());
        System.out.println(t);

    }
}
