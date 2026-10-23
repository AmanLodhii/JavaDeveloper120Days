import java.util.Scanner;

public class Day03_Scanner {
        public static void main(String[] args) {
//
//            String name = "aman";
//            int age = 21;
//            System.out.println("Hello " + name + ", age " + age);
            Scanner apple = new Scanner(System.in);
//            String name = aple.nextLine();
//            System.out.println("my name is : " + name);
            System.out.print("Enter yours age - ");
            int age = apple.nextInt();
            apple.nextLine();
            System.out.print("Enter yours name - ");
            String name = apple.nextLine();



        }
}
