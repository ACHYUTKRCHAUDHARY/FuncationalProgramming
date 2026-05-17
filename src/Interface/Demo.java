package Interface;

public class Demo {
    static void main() {
        /*
    we cant write the car as Car() in the below statement cause car is an
    interface there fore we have to use the concrete class
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