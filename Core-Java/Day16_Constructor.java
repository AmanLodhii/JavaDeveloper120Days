class Student1 {
    String name;
    int rollNumber;
//    double marks;
//    Student1(){
//        String name;
//        int rollno;
//    }
    Student1(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    Student1(Student1 other){
        this.name = other.name;
        this.rollNumber = other.rollNumber;
    }
    void display(){
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name);
    }
}
public class Day16_Constructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Aman" , 451245);
        Student1 s2 = new Student1(s1);
////        s1.name = "Aman";
////        s1.rollNumber = 451245;
////        s1.marks = 89.00;
        s1.display();
        s2.display();
//    }
    }
}

// Constructor - special keyword
//    rules - class name and constructor name same hoga
////` types of constructor
//        default constructor
//        no arg cons
//        paramaterzied
//