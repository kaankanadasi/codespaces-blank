package Princeton2.ThreeSort;

public class ThreeSort {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int third = Integer.parseInt(args[2]);

        int max = Math.max(Math.max(first, second), third);
        int min = Math.min(Math.min(first, second), third);
        int middle = (first + second + third) - max - min;

        /* TO MAKE THE CODE WORK I WROTE (IN THE THERMINAL)
        cd /workspaces/codespaces-blank 
        javac Princeton2/ThreeSort/ThreeSort.java 
        java Princeton2.ThreeSort.ThreeSort 1 2 3 */

        System.out.println(min + " " + middle + " " + max);

                /* or you can create an array to hold the values and sort the values in ascending order
                
                int[] values = {first, second, third};
                java.util.Arrays.sort(values);    
                for (int value : values) {
                    System.out.print(value);
                }   
                             
                */ 
    }
}
