import java.util.Scanner;

public class Week01_minI_Project {

    public static void main(String[] args) {

        // Student Management / Grade System
        // Concepts used:
        // Variables, Data Types, Scanner, Operators,
        // if-else and basic control flow

        Scanner studentInput = new Scanner(System.in);

        // -----------------------------
        // Student Details
        // -----------------------------

        System.out.print("Enter Student Name - ");
        String name = studentInput.nextLine();

        System.out.print("Enter Roll Number - ");
        String rollNumber = studentInput.nextLine();

        System.out.print("Enter Class (1-12) - ");
        int classSection = studentInput.nextInt();

        // Validate class
        if (classSection < 1 || classSection > 12) {
            System.out.println("Invalid class!");
            studentInput.close();
            return;
        }

        studentInput.nextLine();

        System.out.print("Enter your Stream - ");
        String stream = studentInput.nextLine();

        // -----------------------------
        // Variables for Marks
        // -----------------------------

        int English = 0;
        int Hindi = 0;
        int Maths = 0;
        int Science = 0;
        int SocialScience = 0;
        int Physics = 0;
        int Chemistry = 0;

        // -----------------------------
        // Enter Marks
        // -----------------------------

        if (classSection <= 10) {

            System.out.println("\nEnter marks:");

            System.out.print("English - ");
            English = studentInput.nextInt();

            System.out.print("Hindi - ");
            Hindi = studentInput.nextInt();

            System.out.print("Maths - ");
            Maths = studentInput.nextInt();

            System.out.print("Science - ");
            Science = studentInput.nextInt();

            System.out.print("Social Science - ");
            SocialScience = studentInput.nextInt();

        } else {

            System.out.println("\nEnter marks:");

            System.out.print("English - ");
            English = studentInput.nextInt();

            System.out.print("Hindi - ");
            Hindi = studentInput.nextInt();

            System.out.print("Maths - ");
            Maths = studentInput.nextInt();

            System.out.print("Physics - ");
            Physics = studentInput.nextInt();

            System.out.print("Chemistry - ");
            Chemistry = studentInput.nextInt();
        }

        // -----------------------------
        // Calculate Total Marks
        // -----------------------------

        int totalMarks;

        if (classSection <= 10) {

            totalMarks = English + Hindi + Maths + Science + SocialScience;

        } else {

            totalMarks = English + Hindi + Maths + Physics + Chemistry;
        }

        // -----------------------------
        // Calculate Percentage
        // -----------------------------

        double percentage = (totalMarks / 500.0) * 100;

        // -----------------------------
        // Calculate Grade
        // -----------------------------

        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 75) {
            grade = "A";
        } else if (percentage >= 65) {
            grade = "B+";
        } else if (percentage >= 55) {
            grade = "B";
        } else if (percentage >= 45) {
            grade = "C+";
        } else if (percentage >= 33) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        // -----------------------------
        // Final Result
        // -----------------------------

        System.out.println("\n==============================");
        System.out.println("       STUDENT RESULT");
        System.out.println("==============================");

        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Class      : " + classSection);
        System.out.println("Stream     : " + stream);
        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);

        System.out.println("==============================");

        studentInput.close();
    }
}