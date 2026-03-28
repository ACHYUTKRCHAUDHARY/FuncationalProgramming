package Generics;

/**
 * Demonstrates type safety, upcasting, and downcasting in Java.
 *
 * Type safety:
 * Rules that restrict operations to compatible data types.
 *
 * Example:
 * long l = 1234567890;
 * int i = (int) l; // explicit casting required
 */
public class Generics {

    // Parent class
    class Animal {
        void walk() {
            System.out.println("walk");
        }

        void eat() {
            System.out.println("eat");
        }

        void run() {
            System.out.println("run");
        }
    }

    // Child class
    class Dog extends Animal {
        void bark() {
            System.out.println("bark");
        }
    }
// Animal a = new Dog();
// Dog d = new Dog();
    // both of them are pointing to the dog class from the stack memory
    // through the heap memory. now dog is the general object in the heap
    // memory

    public static void main(String[] args) {
        Generics obj = new Generics();

        // Upcasting
        Animal a = obj.new Dog(); // parent reference → child object

        a.walk(); // allowed
        a.eat();  // allowed

        // a.bark(); Not allowed (reference type = Animal)

        // Downcasting
        Dog d = (Dog) a;
        d.bark(); // now allowed
    }
}
