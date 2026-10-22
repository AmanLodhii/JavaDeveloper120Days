public class Day02TypesCasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println("Widening Convert int into double = " + b);
        double pi = 9.78;
        int x = (int) pi;
        System.out.println("Narrowing Convert double into int = " + x);
        int big = 130;
        byte y = (byte) big;
        System.out.println(y);
//      130 does not fit in a byte (max 127), so it wraps around: 130 - 256 = -126.
        char ch = 'A';
        int hello = ch;
        System.out.println(ch);
//      A char is a number underneath (its Unicode code). 'A' is 65.
        char value = (char)(ch);
        System.out.println(value);
        char next = (char) (ch + 1);
        System.out.println(next);
//      ch + 1 is an int (66), so you must cast back to char to get 'B'.
    }
}
