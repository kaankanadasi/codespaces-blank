package Princeton2.DayOfWeek;

public class DayOfWeek {
    public static void main(String[] args) {
            int m = Integer.parseInt(args[0]);
            int d = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[2]);
        // command line args

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        // Gregorian calendar formulas

        /* TO MAKE THE CODE WORK I WROTE (IN THE THERMINAL)
        cd /workspaces/codespaces-blank 
        javac Princeton2/DayOfWeek/DayOfWeek.java 
        (then for example) java Princeton2.DayOfWeek.DayOfWeek 9 8 2023 (for command line args)*/ 

        if (d0 == 1) {
            System.out.println("Monday");
        }
        else if (d0 == 2) {
            System.out.println("Tuesday");
        }
        else if (d0 == 3) {
            System.out.println("Wednesday");
        }
        else if (d0 == 4) {
            System.out.println("Thursday");
        }
        else if (d0 == 5) {
            System.out.println("Friday");
        }
        else if (d0 == 6) {
            System.out.println("Saturday");
        }
        else {
        System.out.println("Sunday");
        }

    }
}
