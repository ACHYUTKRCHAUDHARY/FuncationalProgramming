package Interface;

public class Demo {
    static void main() {
       /*
 We cannot create an object of an interface directly.

 Therefore, we use a concrete class (like Thar)
 that implements the interface.
*/
        Car c = new Thar();
        c.drive();
    }
}
interface Car{
    void drive();
}

class Thar implements Car{
    @Override
    public void drive() {
        System.out.println("Thar is driving");
    }
}