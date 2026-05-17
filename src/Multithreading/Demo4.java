package Multithreading;

public class Demo4 {
    static void main() {
        Thread t1 = new Thread(()->{
            System.out.println("current thread name is "+Thread.currentThread().getName());
        });
        /*
        until and unless start method is not called then operating system
        will not create new thread
        that is the reason we use the start() instead of the run()
        run() will always call the main thread
         */
        t1.start();
        t1.run();
    }
}

//start() or run()

// can we start() the same thread twice?--> no
