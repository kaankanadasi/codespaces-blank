package Princeton2;

import java.util.Scanner;

public class SumOfSines {
    public static void main(String[] args) {

    double degrees = Double.parseDouble(args[0]);
    double t = Math.toRadians(degrees);
    double sum = Math.sin(2 * t) + Math.sin(3 * t);
    System.out.println(sum);

    }
}
