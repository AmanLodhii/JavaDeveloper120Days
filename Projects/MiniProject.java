import java.util.Scanner;

public class MiniProject {

        public static void main(String[] args) {

            Scanner studentInput = new Scanner(System.in);

            // --------------------------------
            // Student Details
            // --------------------------------

            System.out.print("Enter Student Name - ");
            String name = studentInput.nextLine();

            System.out.print("Enter Roll Number - ");
            String rollNumber = studentInput.nextLine();

            System.out.print("Enter Class (1-12) - ");
            int classSection = studentInput.nextInt();

            // Class validation
            while (classSection < 1 || classSection > 12) {
                System.out.print("Invalid Class! Enter class again (1-12) - ");
                classSection = studentInput.nextInt();
            }

            studentInput.nextLine();

            System.out.print("Enter your Stream - ");
            String stream = studentInput.nextLine();

            // --------------------------------
            // Subjects
            // --------------------------------

            String[] subjects;

            if (classSection <= 10) {

                subjects = new String[]{
                        "English",
                        "Hindi",
                        "Maths",
                        "Science",
                        "Social Science"
                };

            } else {

                subjects = new String[]{
                        "English",
                        "Hindi",
                        "Maths",
                        "Physics",
                        "Chemistry"
                };
            }

            // --------------------------------
            // Marks
            // --------------------------------

            int[] marks = new int[subjects.length];

            System.out.println("\nEnter marks (0-100)");

            // Loop for taking marks
            for (int i = 0; i < subjects.length; i++) {

                System.out.print(subjects[i] + " - ");
                marks[i] = studentInput.nextInt();

                // Marks validation
                while (marks[i] < 0 || marks[i] > 100) {

                    System.out.print(
                            "Invalid marks! Enter " + subjects[i] + " marks again (0-100) - "
                    );

                    marks[i] = studentInput.nextInt();
                }
            }

            // --------------------------------
            // Calculate Total
            // --------------------------------

            int totalMarks = 0;

            for (int i = 0; i < marks.length; i++) {
                totalMarks = totalMarks + marks[i];
            }

            // --------------------------------
            // Calculate Percentage
            // --------------------------------

            double percentage = (totalMarks / (subjects.length * 100.0)) * 100;

            // --------------------------------
            // Calculate Grade
            // --------------------------------

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

            // --------------------------------
            // Display Result
            // --------------------------------

            System.out.println("\n=================================");
            System.out.println("        STUDENT RESULT");
            System.out.println("=================================");

            System.out.println("Name        : " + name);
            System.out.println("Roll Number : " + rollNumber);
            System.out.println("Class       : " + classSection);
            System.out.println("Stream      : " + stream);

            System.out.println("\nSubject Marks:");

            // Loop for displaying marks
            for (int i = 0; i < subjects.length; i++) {
                System.out.println(subjects[i] + " : " + marks[i]);
            }

            System.out.println("---------------------------------");
            System.out.println("Total Marks : " + totalMarks + "/" + (subjects.length * 100));
            System.out.println("Percentage  : " + percentage + "%");
            System.out.println("Grade       : " + grade);

            System.out.println("=================================");

            studentInput.close();
        }
}