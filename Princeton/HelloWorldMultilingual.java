package Princeton;
import java.util.Random;

public class HelloWorldMultilingual {
    // the actual excersise was unnecessary so I made this code instead
    public static void main(String[] args) {
        String[] languages = {"Hello World!", "Salam Dünya!", "Hej Verden!", "Hallo Wereld!", "Ciao Mondo!", "Hola Mundo!", "Ahoj svet!", "Salut Lume!"};
        helloWorldMultilingual(languages);
        // calling the helloWorldMultilingual method, passing the languages array as an argument.

        for (String language: languages) {
            System.out.println(language);
            /*  Loop through the languages array and print each greeting to the console in order. The loop iterates 
            through each element in the languages array one at a time, and for each iteration, the current element 
            is assigned to the language variable. */
        }
    }

    public static void helloWorldMultilingual(String[] args) {
        // args is the parameter
        int n = args.length;
        // array length
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            // Generate a random index between 0 and i (inclusive)

            // Swap args[i] and args[j]
            String temp = args[i];
            args[i] = args[j];
            args[j] = temp;
        }
    }

}