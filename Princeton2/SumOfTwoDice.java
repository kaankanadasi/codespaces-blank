package Princeton2;
import java.util.Random;

public class SumOfTwoDice {
    public static void main(System[] args) {
        Random rand = new Random();
            int random1 = rand.nextInt(6); 
            int random2 = rand.nextInt(6); 
        System.out.println(random1 + random2);
    }
}