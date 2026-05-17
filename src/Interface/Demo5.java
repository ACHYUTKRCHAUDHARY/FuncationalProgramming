package Interface;

public class Demo5 {
    static void main() {

    }
}

//multiple inheritance
//diamond problem
interface A{
    void run();
}
interface B{
    void eat();
}
class C implements A,B{
    @Override
    public void run() {}
    @Override
    public void eat() {}
}

