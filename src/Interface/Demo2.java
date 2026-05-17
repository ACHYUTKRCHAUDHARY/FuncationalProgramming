package Interface;
import java.util.*;

public class Demo2 {
    static void main() {
        Car1 c = new BlackThar(){

        };

    }
}


interface Car1{
    void drive();
}
/*
when class does not want to override the interface functionality , then we
have to make the class as the abstract method
 */
abstract class Thar1 implements Car1{
    abstract public void drive();
}
class BlackThar extends Thar1{
    @Override
    public void drive() {

    }
}