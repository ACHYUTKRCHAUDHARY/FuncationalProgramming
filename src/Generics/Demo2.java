package Generics;

public class Demo2 {
    static void main() {
        //upcasting
        String s="Hello";
        Object obj=s;

        System.out.println(obj);

        //downcasting
        Object obj2="Aditya";
        String s2=(String)obj2;
        System.out.println(s2);

        //dangerous situation
        Object obj3=10;
        String s3=(String)obj3;
        System.out.println(s3);

    }
}
