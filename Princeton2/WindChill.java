package Princeton2;

public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        // command line arguments ex. (in the terminal) java Princeton2.WindChill -20.0 25.0
        
        if ((Math.abs(t) > 50) || (3.0 > v)  || (v > 120.0)) {
            System.out.println("The formula is not valid in these values of t and v");
        }
        else {
            double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println("Wind chill is " + w);
        }     
    }
}
