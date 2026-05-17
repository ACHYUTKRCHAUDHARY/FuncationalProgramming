package Multithreading;

public class Demo2 {
    static void main() {
//        Myrunnable myrunnable = new Myrunnable();
//        Thread thread = new Thread(myrunnable);

        Thread thread = new Thread(() -> System.out.println("Thread is " +
                "running"));
        thread.start();
    }
}

class Myrunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("thread2 is running");
    }
}
