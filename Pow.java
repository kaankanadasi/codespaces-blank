import java.util.Scanner;

public class Pow {
    public static void main(System[] args) {
        Scanner scan = new Scanner(System.in);
        double i = scan.nextDouble();
        double num = i * i;
        System.out.println(num);
        scan.close();
    }
}