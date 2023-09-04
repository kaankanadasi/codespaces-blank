import java.util.Scanner;
/* This imports the Scanner class from the java.util package. Importing a class allows you to use 
that class in your Java code without having to specify the full package name every time you use it. */
public class twentyfiveLines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // used for reading input 
        boolean playAgain = true;
        while (playAgain) {
            System.out.print("Pick a number between 0 and 10: ");
            int number = scan.nextInt();
            // reads an integer value
                if (number < 0 || number > 10) {
                    System.out.println("Please pick a number between 0 and 10.");
                } else {
                    int rand = (int)(Math.random() * 11);
                    /* Math.random() is a method in the Math class in Java that returns a random double value in the range
                    [0, 1). By multiplying Math.random() by 11, you expand the range of random values to [0, 11). Since we 
                    want an integer for the purpose of this code, we convert the double value to an integer by using (int). */ 
                        if (rand == number) {
                            System.out.println("This was the right number," + rand + ".");
                        } else {
                            System.out.println("Sorry, the correct number was " + rand + ".");
                        }
                }
                    scan.nextLine(); 
                    /* When you use methods like scan.nextInt(), they read the integer but do not consume the newline 
                    character that the user enters when they press the Enter key after typing the number. This newline 
                    character is left in the input buffer and can cause issues when you attempt to read strings or lines 
                    of text using scan.nextLine(). */
                    System.out.print("Do you want to play again? (yes/no): ");
                    String playAgainInput = scan.nextLine().toLowerCase();
                    playAgain = playAgainInput.equals("yes");                
                }
                System.out.println("Thanks for playing.");
                scan.close();
                // This is used to ensure proper resource management and avoid potential issues related to resource leaks.
    }
}