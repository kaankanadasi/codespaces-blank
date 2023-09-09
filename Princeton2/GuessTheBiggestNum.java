package Princeton2;
import java.util.Random;
public class GuessTheBiggestNum {
    public static void main(String[] args) {
    Random rand = new Random();
    int[] randomNum = new int[2];

    randomNum[0] = rand.nextInt(101);
    randomNum[1] = rand.nextInt(101);

    boolean bobWins = false;
    int selectedNumber;

    if (randomNum[0] > 50) {
        selectedNumber = randomNum[1];
        if (randomNum[1] <= 50) {
            bobWins = true;
        }
    } else {
        selectedNumber = randomNum[0];
        bobWins = true;
    }

    System.out.println("Bob chooses the card with value: " + selectedNumber);
    
    if (bobWins) {
        System.out.println("Bob wins");
    } else {
        System.out.println("Bob loses");
    }

    /* THIS DOES NOT WORK AS INTENDED
    int selectedIndex = rand.nextInt(randomNum.length);
    int selectedNumber = randomNum[selectedIndex];
    boolean again = true;
    while (again) {
        if (selectedNumber > 50) {
            System.out.println(selectedNumber);
            again = false; 
        }
        else {
            selectedIndex = rand.nextInt(randomNum.length);
            selectedNumber = randomNum[selectedIndex];
        }
    } */
    

    }
}
