import java.util.Scanner;

public class divisibility {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        // Input values for x and y
        System.out.print("Enter the value of x: ");
        int x = scan.nextInt();
        
        System.out.print("Enter the value of y: ");
        int y = scan.nextInt();
        
        // Check if both x and y are divisible by 7
        boolean isDivisible = (x % 7 == 0) && (y % 7 == 0);
        System.out.println(isDivisible);
        scan.close();
    }
}