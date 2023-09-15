package Unit2;

public class CallingVoidMethodWithParameters {
    // A void method that takes two arguments and prints a message
    public void printMessageWithParameters(String message, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Example class
        CallingVoidMethodWithParameters example = new CallingVoidMethodWithParameters();

        // Call the printMessageWithParameters method with arguments
        example.printMessageWithParameters("Hello, Java!", 3);
    }
}