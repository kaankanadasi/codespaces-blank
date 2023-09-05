package Princeton;
import java.util.Random;

public class HelloWorldMultilingual {
    // the actual excersise was unnecessary so I made this code instead
    public static void main(String[] args) {
        String[] languages = {"Hello World!", "Salam Dünya!", "Hej Verden!", "Hallo Wereld!", "Ciao Mondo!", "Hola Mundo!", "Ahoj svet!", "Salut Lume!"};
        helloWorldMultilingual(languages);

        for (String language: languages) {
            System.out.println(language);
        }
    }

    public static void helloWorldMultilingual(String[] arr) {
        int n = arr.length;
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = rand.nextInt(i + 1);

            // Swap arr[i] and arr[j]
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}