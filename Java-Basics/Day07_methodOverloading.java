public class Day07_methodOverloading {
//    public int add(int a, int b) { // not using static keyword
//        return a + b;
//    }

//    public static void main(String[] args) {
//        Day07_methodOverloading apple = new Day07_methodOverloading();
//        System.out.println(apple.add(55,45));
//
//    }
    int add(int a, int b) {
    return a + b;
}

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Day07_methodOverloading banana = new Day07_methodOverloading();

        System.out.println(banana.add(10, 20));
        System.out.println(banana.add(2.5, 3.5));
        System.out.println(banana.add(10, 20, 30));
    }
}
