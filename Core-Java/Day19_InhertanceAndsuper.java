//// Single inheritance
//class Animal{
//    String name;
//
//    void eat(){
//        System.out.println(name + "eats ");
//    }
//}
//
//class Dog extends Animal{
//    void Bark(){
//        System.out.println(name + " Braks");
//    }
//}
//// multilevel inheritance
//class A{
//    int number = 01;
//    void show(){
//        System.out.println("I am class A");
//    }
//}
//
//class B extends A{
//    int number = 02;
//    void show(int number){
//        System.out.println("Number of clas is - " + number);
//    }
//}
//// Hierarchical inheritance
//class D extends A{
//
//}
//class E extends A{
//
//}
//    Super method()
class Animal{
    Animal(String name){
        System.out.println("Animal: " + name);
    }
    void sound(){
        System.out.println("Some sound");
    }
}

class Dog extends Animal{
    Dog() {
        super("Tommy");               // must be the first statement
        System.out.println("Dog created");
    }
    void sound(){
        super.sound();              // parent's version first
        System.out.println("Bark");
    }
}

// super field
class A {
    int x = 10;
}

class B extends A{
    int x = 20;
    void show(){
        System.out.println(x);
        System.out.println(super.x);
    }
}

// Super.field


public class Day19_InhertanceAndsuper {
    public static void main(String[] args) {
//        Dog d1 = new Dog();
//        d1.name = "Max";
//        d1.Bark();
//        System.out.println("Multilevel inheritance");
//        B b1 = new B();
//        b1.show();          // Inherit the class A
//        b1.show(01); // call own method
//
//        System.out.println("Hierarchical Inheritance");
//        D D1 = new D();
//        D1.show();      // inherit the class A
//
//        E e1 = new E();
//        e1.show();      // inherit the class A

//        Object of class Dog
        System.out.println("super.method() calls the parent's version");
        Dog max = new Dog();
        max.sound();

        System.out.println("super.field access a hidden parent field");
        B b1 = new B();
        b1.show();;

        System.out.println("super(...) calls the parent constructor");

    }
}
