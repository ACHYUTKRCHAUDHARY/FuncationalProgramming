package Final;

public class Final2 {
    static void main() {
        Random1 r1=new  Random1();
        System.out.println(r1.PI);
    }
}

class Random1{
    final double PI;
    Random1(){
        PI=3.14;
    }
}
