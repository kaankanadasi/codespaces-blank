import java.util.Scanner;

public class Euclidean {
    public static void main(System[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the first x then y: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.print("write the second x then y: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double diffx = x2-x1;
        double diffy = y2-y1;
        double distanceSquared = diffx * diffx + diffy * diffy;

        double sqrt = distanceSquared /(diffx + diffy);
        System.out.println(sqrt);
        scan.close();
    }
}
