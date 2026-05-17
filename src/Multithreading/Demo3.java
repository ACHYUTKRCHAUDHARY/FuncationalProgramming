package Multithreading;

public class Demo3 {
    static void main() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());


        Thread t1 = new Thread(()->{
            System.out.println("Name of my thread is "+Thread.currentThread().getName());
            System.out.println("id of my thread is "+Thread.currentThread().getId());
        });
        Thread t2 = new Thread(()->{
            System.out.println("Name of my thread is "+Thread.currentThread().getName());
            System.out.println("id of my thread is "+Thread.currentThread().getId());
        });
        t1.start();
        t2.start();
    }
}

// thread id and thread name


