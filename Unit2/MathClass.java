package Unit2;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder (in meters): ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder (in meters): ");
        double height = scanner.nextDouble();

        double area = height * Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the cylinder with radius " + radius + " and height " + height + " meters is " + area + " cube meters.");

        scanner.close();
    }
}