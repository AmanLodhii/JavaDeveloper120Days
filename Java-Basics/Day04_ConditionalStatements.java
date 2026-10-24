public class Day04_ConditionalStatements {
    public static void main(String[] args) {
        int age = 12;
        if (age>=18){
            System.out.println("you is eligible for vote");
        }else{
            System.out.println("you are not eligible for vote ");
        }

        int marks = 45;
        if (marks>=90){
            System.out.println("Grade A+");
        } else if (marks >= 75) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        }else{
            System.out.println("you are fail");
        }

        int day = 3;
        switch (day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("other days ");
        }

//        arrow form
        int no = 6;
        String apple = switch (no){
            case 6,7 -> "weekend";
            case 1,2,3,4,5 -> "working day";
            default -> "Invalid";
        };
        System.out.println(apple);
    }
}
