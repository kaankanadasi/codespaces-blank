package Princeton2;
import java.util.Scanner;

public class BodyMaxIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your weight (in kg): ");
        double weight = scan.nextDouble();
        System.out.println("Write your height (in meters): ");
        double height = scan.nextDouble();
        double heightSqrt = Math.sqrt(height);
        double BMI = weight/ heightSqrt;
        System.out.println(BMI);
        scan.close();
    }
}
