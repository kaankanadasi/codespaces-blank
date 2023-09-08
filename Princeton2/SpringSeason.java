package Princeton2;
import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write a month: ");
        int m = scan.nextInt();
        System.out.print("Write a day: ");
        int d = scan.nextInt();
        /* use  
        int month = Integer.parseInt(args[0]); 
        int day   = Integer.parseInt(args[1]);
        instead */ 

        boolean isSpring =  (m == 3 && d >= 20 && d <= 31) || (m == 4 && d >=  1 && d <= 30) 
        || (m == 5 && d >=  1 && d <= 31) || (m == 6 && d >=  1 && d <= 20);

        System.out.println(isSpring);

        scan.close();
    }
}