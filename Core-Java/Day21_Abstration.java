abstract class Vehicle {
    abstract void start();            // no body: children decide how

    void fuelUp() {                   // normal method, shared by all
        System.out.println("Refueling...");
    }
}

class Car extends Vehicle {
    @Override
    void start() { System.out.println("Car starts with a key"); }
}

class Bike extends Vehicle {
    @Override
    void start() { System.out.println("Bike starts with a kick"); }
}

//  Interface in java
interface Payment {
    void pay(double amount);   // automatically public and abstract
}

class UpiPayment implements Payment {
    public void pay(double amount){
        System.out.println("UPI: " + amount);
    }
}

class CardPayment implements Payment {
    public void pay(double amount){
        System.out.println("Card: " + amount);
    }
}
public class Day21_Abstration {
    public static void main(String[] args) {
//        Vehicle v = new Vehicle();
//        ERROR: cannot create an object of an abstract class
        Vehicle v = new Car();
        v.start();
        Vehicle v1 = new Bike();
        v1.start();
    }
}
