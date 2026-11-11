class Student {
    private String name;
    private double marks;

    public String getName(String aman) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getMarks() {
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

public class Day17_Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Raju");
        s1.setMarks(80);
        s1.getMarks();
        s1.getName("Hello");
        System.out.println(s1.getName("Aman"));

    }
}
