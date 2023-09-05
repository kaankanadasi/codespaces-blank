import java.util.Scanner;

public class Distance {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        // Input values for x and y
        System.out.print("Enter the value of x: ");
        int x = scan.nextInt();
        
        System.out.print("Enter the value of y: ");
        int y = scan.nextInt();
        
        // Check if both x and y are divisible by 7
        double dist = Math.sqrt(x*x + y*y);
        System.out.println("distance from (" + x + ", " + y + " to (0,0) = " + dist);
        scan.close();
    }
}