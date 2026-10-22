public class Day03_OperationAndExpression {
    public static void main(String[] args) {
        int a = 10, b = 3;
        int c;
        //    Arithmetic operators
        System.out.println("+ operator - " + (c = a+b));
        System.out.println("- operator - " + (c = a-b));
        System.out.println("* operator - " + (c = a*b));
        System.out.println("/ operator - " + (c = a/b));
        System.out.println("% operator - " + (c = a%b));

//        Relational Operator
        System.out.println("> operator - " + (a>b));
        System.out.println("< operator - " + (a<b));
        System.out.println(">= operator - " + (a>=b));
        System.out.println("<= operator - " + (a<=b));
        System.out.println("== operator - " + (a==b));
        System.out.println("!= operator - " + (a!=b));

//        Logical operators
        System.out.println("And && operator - " + (a>b && a>=b));
        System.out.println("OR || operator - " + (a==b || a>b));
//        System.out.println("Not ! operator - " + (!a));

//        Assignment operators
        System.out.println("Assign = operator a=10 - " + a);
        System.out.println("addAndAssign += operator - " + (a+=2));
        System.out.println("minusAndAssign -= operator - " + (a-=5));
        System.out.println("*= operator - " + (a*=12));
        System.out.println("/= operator  - " + (a/=2));

//        unary operator
        System.out.println("print a - " + a);
        System.out.println("post increment operator i++ - " + a++); // output = a
        System.out.println(a);
        System.out.println("pre increment operator ++i - " + ++a); // output = a+2

        System.out.println("post Decrement i-- operator - " + a--);
        System.out.println(a);
        System.out.println("pre Decrement --i operator - " + --a);

        if (a>=b){
            System.out.println("hello");
        }else{
            System.out.println("false");
        }

        System.out.println(a+(b-a)*b/a%a);

    }
}
