class student{
//    Fields (state) and methods (behavior)
    // FIELDS (state / data) - what the object HAS
        String name;
        int rollNo;
        double marks;

    // METHOD (behavior) - what the object CAN DO
    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
//    Fields (also called instance variables or attributes) are variables declared inside the
//    class but outside any method.
//    Methods are functions inside the class that work on that data.
//    Every object gets its own copy of the fields. Changing s1.name doesn’t affect s2.name.
//    Methods are shared code, but they operate on the specific object you call them on.


}
public class Day15_oops {
//    1. Why OOP exists
    String name1 = "Aman";
    int roll1 = 1;
    double marks1 = 85.5;
    String name2 = "Riya";
    int roll2 = 2;
    double marks2 = 91.0;
    String name3 = "Kabir";
    int roll3 = 3;
    double marks3 = 78.0;

//    Problem
//    With 500 students, you’d need 1,500 variables.
//    Nothing links name1, roll1, and marks1 together except your memory.

//    The OOP idea: bundle the data and the actions on that data together
//    into one unit, modeled on real-world things.

    public static void main(String[] args) {
//    Create Oject by using new keyboard
        student s1 = new student();

//    student s1 = declare a reference variable
//    new student() = create actual object in memory(Heap)

//    The new keyword does three things:
//
//    Allocates memory on the heap for the object
//    Sets all fields to their default values
//    Calls the constructor (Student()).
        s1.name = "Aman";
        s1.rollNo = 1;
        s1.marks = 85.5;
        s1.display();

//        Reference variables and memory (stack vs. heap)
//        This is the part most beginners skip, and interviewers love it.
//
//        Two memory areas to know:
//        Stack: stores local variables and method calls. It’s fast and small,
//        and each method call gets its own frame that disappears when the method ends.
//        Heap: stores all objects. It’s larger and shared across the program, and
//        the Garbage Collector cleans it up.
        int x = 10;                  // x holds the VALUE 10 (on the stack)
        student s2 = new student();  // s1 holds an ADDRESS pointing to the object (object is on heap)
    }
}

/*
Advanced concepts you must understand
    a) Two references, one object (aliasing)
        Student s1 = new Student();
        s1.name = "Aman";

        Student s2 = s1;       // copies the ADDRESS, not the object
        s2.name = "Riya";

        System.out.println(s1.name);  // Riya !!

    b) Two references, two objects
        Student s1 = new Student();
        Student s2 = new Student();   // completely separate object
    c) null references
        Student s3 = null;       // remote with no TV attached
        s3.display();            // NullPointerException!
        NullPointerException (NPE) is the most common Java runtime error.
         It means you used a reference that points to nothing.
    d) Reassigning a reference
        Student s1 = new Student();   // object A
        s1 = new Student();           // s1 now points to object B
        Object A now has no reference pointing to it, so it becomes eligible
        for garbage collection. Java frees that memory automatically, with no free() like in C.
    e) == on objects compares addresses
        Student a = new Student();
    Student b = new Student();
    System.out.println(a == b);   // false: different objects, even if the data were identical
    f) Printing an object directly
        System.out.println(s1);   // prints something like Student@1b6d3586
        That’s ClassName@hashcode. To print meaningful output, either call
         display() or override toString() (a later topic).
 */