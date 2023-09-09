package Princeton2.CartesionToPolar;

public class CartesianToPolar {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        // command line args (ex. java Princeton2.CartesianToPolar.CartesianToPolar 4 5)

        double r = Math.sqrt(x*x + y*y);
        double theta = Math.atan2(y, x);

        /* TO MAKE THE CODE WORK I WROTE (IN THE THERMINAL)
        cd /workspaces/codespaces-blank 
        javac Princeton2/CartesianToPolar/CartesianToPolar.java */

        System.out.println("r = " + r);
        System.out.println("theta = " + theta);
    }
}