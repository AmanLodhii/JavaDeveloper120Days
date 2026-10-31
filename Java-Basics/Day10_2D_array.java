import java.util.Scanner;

public class Day10_2D_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        // Taking input
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.print(
                        "Enter element [" + i + "][" + j + "]: "
                );

                matrix[i][j] = sc.nextInt();
            }
        }

        // Displaying matrix
        System.out.println("Your Matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }

        sc.close();
    }
}
