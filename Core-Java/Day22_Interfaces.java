interface Animals {
    void eat();
    void sleep();
}
// Understand the concept interface
class Dogs implements Animals{
    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps in a kennel.");
    }
}
// Can a Class Implement Multiple Interfaces?
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}
// Static Method
interface Example {
    static void staticMethod() {
        System.out.println("This is a static method in an interface.");
    }
}
// Default Method
//interface Example01 {
//    default void defaultMethod() {
//        System.out.println("This is a default method.");
//    }
//}
//class Demo implements Example {
//    public static void main(String[] args) {
//        Example obj = new Demo();
//        obj.defaultMethod();  // Accessing default method
//    }
//}
// Interface Inheritance
interface Animal01 {
    void eat();
}

interface Mammal extends Animal01 {
    void walk();
}

class Human implements Mammal {
    @Override
    public void eat() {
        System.out.println("Human eats food.");
    }

    @Override
    public void walk() {
        System.out.println("Human walks on two legs.");
    }
}
public class Day22_Interfaces {
    public static void main(String[] args) {
        Animals A1 = new Dogs();
        A1.eat();
        A1.sleep();
        System.out.println();
        Duck D1 = new Duck();
        D1.fly();
        D1.swim();
        System.out.println();
        Example.staticMethod();
        System.out.println();
        Mammal M1 = new Human();
        M1.walk();
        M1.eat();

    }
}
