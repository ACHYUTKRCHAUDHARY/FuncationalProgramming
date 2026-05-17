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
        r1.fun();

    }
}
//variables inside interfaces
/*
where we use this property ?
we use this property in the production grade application where we have to use
 the constant values and then we use interfaces and use it
 we can same achieve the  with the class only but the issue it we have to
 declare all the static final and public things over there that we use the
 interfaces instead
 */
interface MathConstant{
    /*
    by default in the interfaces whenever we make the variable it should be
    the in the capital letter and
    under the hood it look like this
    double PI_VALUE=3.14; -> public static final double PI_VALUE=3.14;
     */
    double PI_VALUE=3.14;
    int VALUE =10;
    void fun();
}
class Random implements MathConstant{
    @Override
    public void fun(){
        System.out.println(PI_VALUE);
    }
}
