package Unit2;
import java.util.Scanner;

public class WrapperClasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer age = getInput(scan, "age");
        Integer weight = getInput(scan, "weight (in kg)");

        System.out.println(" Age: " + age + ", Weight: " + weight + " kg");

        scan.close();
    }

    private static Integer getInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print("Enter your " + prompt + ": ");
            String input = scanner.nextLine();
            
            try {  
                return Integer.parseInt(input);
                /* Autoboxing: Converting primitive int to Integer
                The method returns an Integer, allowing it to handle nullable values and 
                catch NumberFormatException exceptions if the input is not a valid integer. */ 

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid " + prompt + ".");
                // try-catch block to handle potential exceptions.
            }
        }
    }
}