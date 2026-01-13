package FunctionalInterface;

import java.util.function.Function;

public class FunctionInterface {
    public static Function<Integer,Integer> addFunction = (a)-> a+3;
    static void main() {
        System.out.println(addFunction.apply(10));
    }
}
