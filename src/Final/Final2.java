package Final;

public class Final2 {
    static void main() {
        Random1 r1=new  Random1();
        System.out.println(r1.PI);

        final int x;
        x=4;
        System.out.println(x);
    }
}
/*
why main is static in java?
Final2 f= new Final2();
f.main();
JVM calls in this way -> Final2.main()
 */
class Random1{
    final double PI;
    Random1(){
        PI=3.14;
    }
}
