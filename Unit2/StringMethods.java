 package Unit2;
 import java.util.Scanner;
 
class StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        while (true) {          
            System.out.println("Hello user please type your password of at least 6 characters: ");
            String userInput = scan.nextLine();

            if (userInput.isEmpty()) {
                System.out.println("Password cannot be empty. Please try again.");
                // string method to check if stirng is empty 
            } else if (userInput.length() < 6) {
                // string method to check if the lenght of the string is at least 6
                System.out.println("Password must be at least 6 characters long. Please try again.");
            } else {
                System.out.println("Password accepted: " + userInput); // string concatenation
                break; // Exit the loop when a valid password is provided                 
            }
        }
        
        scan.close();
    }
}