package Princeton2.Ordered;

public class Ordered {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        /* TO MAKE THE CODE WORK I WROTE (IN THE THERMINAL)
        java -cp . Princeton2.Ordered.Ordered 1 2 3
        */

        boolean b = false;

        if (x == y + 1) {
            if (y == z +1) {
                b = true;
            }
        } 
        else if (x == y - 1){
            if (y == z - 1) {
                b = true;
            }
        } 

        System.out.println(b);
    }
}
