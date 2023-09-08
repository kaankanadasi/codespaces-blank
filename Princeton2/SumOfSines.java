package Princeton2;

import java.util.Scanner;

public class SumOfSines {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double degrees = scan.nextDouble();
    double t = Math.toRadians(degrees);
    double sum = Math.sin(2 * t) + Math.sin(3 * t);
    System.out.println(sum);
    scan.close();
    }
}
