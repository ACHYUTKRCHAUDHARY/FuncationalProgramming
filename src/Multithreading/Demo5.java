package Multithreading;

public class Demo5 {
    static void main() {
        // 1 to 100(even numbers)
        Thread t1= new Thread(()->{
            for(int i=1;i<=100;i++) {
                if(i%2==0) {
                    System.out.println("T1 "+i);
                }
            }
        });

        //1 to 100(odd number)
        Thread t2= new Thread(()->{
            for(int i=1;i<=100;i++) {
                if(i%2!=0) {
                    System.out.println("T2 "+i);
                }
            }
        });

        t1.start();
        t2.start();
    }
}

//thread is non deterministic
