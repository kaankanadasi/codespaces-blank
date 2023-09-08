package Princeton2;
import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double i = scan.nextDouble();
        double num = i * i;
        System.out.println(num);
        scan.close();
    }
}