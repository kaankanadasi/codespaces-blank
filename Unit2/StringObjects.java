package Unit2;
import java.util.Scanner;

public class StringObjects {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string that reads same by reading from left and right: ");
        String text = scan.nextLine();
        String low = text.toLowerCase();
        // this is a string method

        boolean isPalindrome = false;

        // assesing characters - using String as an array of chars 
        for (int i = 0; i < low.length() / 2; i++) {
            /* compares characters from the beginning of the string to the 
            middle since characters should be mirrored around the center */ 
            if (low.charAt(i) == low.charAt(low.length() - 1 - i)) {
                /* checks if the character at position i (counting from the beginning of the string) is equal to the 
                character at the corresponding position low.length() - 1 - i (counting from the end of the string) */          
                isPalindrome = true;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The word " + "\"" + low + "\""  + " is a palindrome.");
            // here can be seen string literal and string concatenation
        } else {
            System.out.println("The word " + "\"" + low + "\""  + " is not a palindrome.");
        }

        scan.close();
    }
}
