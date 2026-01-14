package FunctionalInterface;

import java.util.function.Function;

public class FunctionInterface {
    public static Function<Integer,Integer> addFunction = (a)-> a+3;
    public static Function<Integer,Integer> subtractFunction = (a)-> a-3;
//    chaining
    public static Function<Integer,Integer> combinedFunction = (addFunction).andThen(subtractFunction);
    static void main() {
        System.out.println(addFunction.apply(10));
        System.out.println(subtractFunction.apply(10));
        System.out.println(combinedFunction.apply(10));
    }
}
