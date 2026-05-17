package Interface;

public class Demo4 {
    static void main() {
        MathConstant r1 =new Random();
        /*
        r1.fun();
        this showing an error cause fun() is not declare in the Mathconstant
        and r1 is the reference variable of the mathConstant
        but there is the fun() in the Random() still we are the not able to
        done it to access the r1.fun()
        there fore to access the r1.fun() we have to create the fun() in the
        interface
         */

    }
}
//variables inside interfaces
interface MathConstant{
    /*
    by default in the interfaces whenever we make the variable it should be
    the in the capital letter and
    under the hood it look like this
    double PI_VALUE=3.14; -> public static final double PI_VALUE=3.14;
     */
    double PI_VALUE=3.14;
    int VALUE =10;

}
class Random implements MathConstant{
    void fun(){
        System.out.println(PI_VALUE);
    }
}
