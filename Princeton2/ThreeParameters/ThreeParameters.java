package Princeton2.ThreeParameters;

public class ThreeParameters {
    public static void main(String[] args) {
        /* TO MAKE THE CODE WORK I WROTE (IN THE THERMINAL)
        cd /workspaces/codespaces-blank 
        javac Princeton2/ThreeParameters/ThreeParameters.java 
        java Princeton2.ThreeParameters.ThreeParameters param1 param2 param3 */
        if (args.length != 3) {
            System.out.println("Provide three parameters.");
            return;
        }

        String param1 = args[0];
        String param2 = args[1];
        String param3 = args[2];

        if (param1.equals(param2) && param2.equals(param3)) {
            System.out.println("All three parameters are equal.");
        } else {
        System.out.println("Not all three parameters are equal.");
        }

        /* In Java, the && operator is used to combine two boolean expressions, and it requires the two expressions 
        to be enclosed in parentheses together.

                if (param1 == param2) && (param2 == param3) {
            System.out.println("All three parameters are equal.");
        }  

        */        
    }
}
