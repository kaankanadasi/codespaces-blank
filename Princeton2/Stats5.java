package Princeton2;
public class Stats5 {
    public static void main(String[] args) {
    double[] randomValues = new double[5]; 
    // Create an array to store the random values

    for (int i = 0; i < 5; i++) { 
        double rand = Math.random(); // Generates a random value between 1 and 0
        randomValues[i] = rand; // Store the random value in the array
    }

    System.out.println("First random value: " + randomValues[0]);
    System.out.println("Second random value: " + randomValues[1]);
    System.out.println("Third random value: " + randomValues[2]);
    System.out.println("Fourth random value: " + randomValues[3]);
    System.out.println("Fifth random value: " + randomValues[4]);
 
    double minValue = Math.min(Math.min(Math.min(Math.min(randomValues[0], randomValues[1]), randomValues[2]), randomValues[3]), randomValues[4]);
    double maxValue = Math.max(Math.max(Math.max(Math.max(randomValues[0], randomValues[1]), randomValues[2]), randomValues[3]), randomValues[4]);
        /* OR TO FIND MAX / MİN 

        double minValue = Double.POSITIVE_INFINITY;
        double maxValue = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < 5; i++) {
            if (randomValues[i] < minValue) {
                minValue = randomValues[i];
            }
            if (randomValues[i] > maxValue) {
                maxValue = randomValues[i];
            }
        }
         
        THİS ITERATES THROUGH THE ARRAY UNTIL IT FINDS THE MAX AND MIN */

    System.out.println("Minimum value is " + minValue);
    System.out.println("Maximum value is " + maxValue);   
    System.out.println("Average value is " + (randomValues[0] + randomValues[1] + randomValues[2] + randomValues[3] + randomValues[4])/5);
    }
}
