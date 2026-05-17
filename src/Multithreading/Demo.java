package Multithreading;

public class Demo {
    static void main() {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
/*
mythread.start() --> jvm asks os to create a new thread --> thread gets
stack/pc space --> mythread starts running
 */
class MyThread extends Thread {
    @Override
    public void run() {
        //logic
        System.out.println("thread is running");
    }
}
