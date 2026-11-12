import org.w3c.dom.ls.LSOutput;

class Student01{
//    final variable
    final int id;
//    static variable
    String name;            // Each object have their own fields
        static String School = "XYZ school"; //One copy share by all
        Student01(String name, int id){ // initial the final variable int id
            this.name = name;
            this.id = id;
    }
//    static method
    static int square(int x){
        System.out.print("Square of " + x + " is - " );
        return x*x;
    }

//    static Block
    static {
        System.out.println("i am Static block and run first when the program is execute");
    }

//    final method
    final void show(){
        System.out.println("It can't we inherit means cannot overrides");
    }
}
//  Final class
final class vault{

}
public class Day18_StaticAndfinalKeyword {
    public static void main(String[] args) {
//        The JVM must start your program before any object exists. If main were non-static,
//        the JVM would need to create an object first, but which class’s object, and
//        with which constructor? Making it static avoids this problem.
        Student01 s1 = new Student01("Raju", 45);
        Student01 s2 = new Student01("Moti",78);
        Student01.School = "ABC school"; // change once
        System.out.println(s1.School); // call the school name by object reference
        System.out.println(Student01.School); // call by the class name which is recommended by the java
//    now call the method by without object
        int result = Student01.square(12);
        System.out.println(result);
//        final variable
        final int schoolPinCode = 462048;
//        schoolPinCode = 7851  now, it is not possible to change.


    }
}
