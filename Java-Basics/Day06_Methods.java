import java.util.Scanner;

public class Day06_Methods {
    public static int add(int a, int b){
        return a+b;
    }
    public static void greets(String name){
        System.out.println("Hello, " + name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name - ");
        String name = sc.nextLine();
        greets(name);
        System.out.print("Enter yours first number - ");
        int a = sc.nextInt();
        System.out.print("Enter yours second number - ");
        int b = sc.nextInt();
        int result = add(a,b);
        System.out.print("Sum of two numbers is - " + result);
        
    }
}
