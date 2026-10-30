import java.util.Scanner;

public class Day09_String {
//    Find the Sum and Average of Array Elements

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int[] numbers = new int[5];
            int sum = 0;

            // Taking array input
            for (int i = 0; i < numbers.length; i++) {

                System.out.print("Enter number: ");
                numbers[i] = sc.nextInt();
            }

            // Calculating sum
            for (int i = 0; i < numbers.length; i++) {

                sum = sum + numbers[i];
            }

            // Calculating average
            double average = (double) sum / numbers.length;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

            sc.close();
        }
}
