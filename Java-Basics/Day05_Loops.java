public class Day05_Loops {
    public static void main(String[] args) {
//        for loop
//        while loop
//        do while loop
//        for each loop

//        for loop
//        for (initialization, condition, update){
//        body
//        }

        System.out.println("1");
        System.out.println("2");

        for (int i = 0; i<=100; i++){
            System.out.println(i);
        }

        Dry code - write the logic by hand

        while loop
      Syntax
        initialization -> int n = 1;
        while(Condition){Body; update}
        int n = 1;
        while (n<4){
            System.out.println(n);
            n++;
        }
//
        int n2 = 2;
        while(n2<=20){
            System.out.println(n2);
            n2 = n2+2;
        }

//        do while
        int n3 = 10;
        do {
            System.out.println("n3 = " + n3);
            n3++;
        }while (n3<= 20);

//        for each loop

        int [] nums = {1,2,3,4,5,6,7,8};
        for(int x : nums){
            if(x==2) continue;
//            if(x==5) break;
            System.out.println(x);
        }

//        nested loop
        for (int i =1; i<=6; i++){
            for(int j = 1; j<=5; j++){
                System.out.println("*");
            }
            System.out.println("/");
        }

    }

}
