package Princeton2.Swap;

public class Swap {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);

        int constant = first;
        first = second;
        second = constant;

        /* TO MAKE THE CODE WORK I WROTE (IN THE THERMINAL)
        cd /workspaces/codespaces-blank 
        javac Princeton2/Swap/Swap.java 
        java Princeton2.Swap.Swap 10 20 */ 

        System.out.println("first = " + first + ", second = " + second);
    }
}
