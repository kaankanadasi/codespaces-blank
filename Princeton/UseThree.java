package Princeton;
import java.util.Scanner;
public class UseThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String name1 = scanner.next();
        System.out.print("Enter the second name: ");
        String name2 = scanner.next();
        System.out.print("Enter the third name: ");
        String name3 = scanner.next();
        
        System.out.println("Hi, " + name3 +  ", " + name2 + " and " + name1 + ".");
        
        scanner.close();
    }
}