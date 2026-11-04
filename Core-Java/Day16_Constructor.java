class Student1 {
    String name; int rollNo; double marks;

    Student1() {                        // no-arg
        name = "Unknown";
    }
    Student1(String name, int rollNo, double marks) {   // parameterized
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}
public class Day16_Constructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s = new Student1("Aman", 1, 85.5);
    }

}
