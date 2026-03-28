package Functions;

public class Demo {
    static int sum(int a, int b) {
        return a+b;
    }
    //no ip,no op
    static void greet(){
        System.out.println("Hello World");
    }
    //ip ,no op
    static void sayHello(String name){
        System.out.println("Hello "+name);
    }

    //no ip,op
    static int  getNum(){
        return 10;
    }
    static void main() {
        int a = 5;
        int b = 5;
        int sum = sum(a, b);
        System.out.println(sum);

        greet();
        sayHello("World");
        getNum();

    }
}
