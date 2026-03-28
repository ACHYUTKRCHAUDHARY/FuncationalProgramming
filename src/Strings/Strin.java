package Strings;

public class Strin {
    /**
     * strings is basically the sequence character and character array.
     * primitive data type is char[] and string is the class with non
     * primitive data type. char[] is and [] is itself non primitive data type
     * but the to give the reference we have int -> Integer similarly
     * char[] -> String
     *
     *String is immmutable java class in which there is no setter there is
     * only getters are present and once it is created it cannot be changeable
     * String can initialise  with two methods literal and new keyword
     */

    static void main() {
        String s1 = "Hello";
        System.out.println(s1);
        //nothing happens here
        s1.concat("World");
        System.out.println(s1);
    }
}
