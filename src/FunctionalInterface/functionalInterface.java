package FunctionalInterface;
//lambda expression
//parameter -> expression body
//() -> {}
interface Operation{
    int add(int a, int b);
}

public class functionalInterface {
    static void main() {
//        first way of calling
        BookAction action = new  BookAction() {
            @Override
            public void perfrom() {
                System.out.println("perfrom");
            }
        };
        action.perfrom();
//        step2
        BookAction action2 = () ->{
            System.out.println("perfrom");
        };
        action2.perfrom();
//        step3
        BookAction action3 = () ->  System.out.println("perfrom");
        action3.perfrom();

//        step1
        Operation operation = new  Operation() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(operation.add(1,2));

//        step2
        Operation operation1 = (int a,int b) ->{
            return a + b;
        };
        operation1.add(1,2);
    }
}
