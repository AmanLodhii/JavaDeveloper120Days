public class Day11_String {
    public static void main(String[] args) {
//        Reverse a String
//        String str = "Java";
//        String reverse = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//
//            reverse = reverse + str.charAt(i);
//        }
//
//        System.out.println("Reverse: " + reverse);


//        Check Palindrome String
        String stri = "madam";

        String reverse = new StringBuilder(stri)
                .reverse()
                .toString();

        if (stri.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

//        Count Vowels and Consonants
        String str = "Java Programming";

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' ||
                        ch == 'i' || ch == 'o' ||
                        ch == 'u') {

                    vowels++;

                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
