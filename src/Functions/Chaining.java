package Functions;

public class Chaining {
    static void main() {
        fun1();
        System.out.println("main");
    }
    static void fun1() {
        fun2();
        System.out.println("fun1");
    }

    static void fun2() {
        fun3();
        System.out.println("fun2");
    }

    static void fun3() {
        System.out.println("fun3");
    }
}
