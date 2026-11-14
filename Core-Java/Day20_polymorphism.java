// compile Time polymorphism
class calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
// Run time polymorphism
class animal{
    void sound(){
        System.out.println("something is around as");
    }
}
class dog extends animal{
    @Override
    void sound() {
        System.out.println("Woaf Woaf ohh he is a dog");
    }
}
class cat extends animal{
    @Override
    void sound(){
        System.out.println("meow meow ohh she is a cat");
    }
}
public class Day20_polymorphism {
    public static void main(String[] args) {
//        call the compile time polymorphism
        calculator c1 = new calculator();
        System.out.println( c1.add(45.2,78.2));

//        call the run time polymorphism
        animal a1 = new cat();
        a1.sound();

        animal[] zoo = {new animal(), new cat(), new dog()};
                for(animal x : zoo) {
                    x.sound();
                }
    }
}
