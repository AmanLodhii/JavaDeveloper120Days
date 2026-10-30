public class Day08_Recursion {
//    public static int sum(int... numbers) {
//
//        int total = 0;
//
//        for (int num : numbers) { // for each loop used
//            total = total + num;
//        }
//
//        return total;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sum(12,45));
//        System.out.println(sum(45,12,45,54,78));
//        System.out.println(sum(-45,-78,888,-500));
//    }
    public static int factorial(int n) {

        if (n == 0 || n == 1) { // base condition
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int result = factorial(6);

        System.out.println(result);
    }
}
