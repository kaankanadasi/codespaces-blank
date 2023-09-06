package Princeton2;
import java.util.Scanner;

public class distance {
    public static void main(System[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("enter the first number, x: ");
        int x = scanner.nextInt();
        System.out.println ("enter the second number, y: ");
        int y = scanner.nextInt();
        double num = Math.sqrt(x*x + y*y);
        System.out.println (num);
        scanner.close();
    }
}
