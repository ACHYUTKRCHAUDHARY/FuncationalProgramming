package Exceptionalhandling;

import java.util.Scanner;
import java.util.*;

public class JavaExample {
    static void main() {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number(dividend) :");
        int a = sc.nextInt();

        System.out.println("Enter second number(divisor) :");
        int b = sc.nextInt();
        try{
            int c = a / b;
            int d = a % b;
            System.out.println("Quotient: "+c);
            System.out.println("Remainder: "+d);
        }catch (Exception e){
            System.out.println("Do not divide it by zero");
            System.out.println("Exception: "+e);
        }

    }
}

