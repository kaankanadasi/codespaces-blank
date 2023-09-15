package Unit2;

public class CallingVoidMethod {
    
    public void message() {
        System.out.println("A void method that prints a message");
    }
    public static void main(String[] args) {
        CallingVoidMethod voidMessage = new CallingVoidMethod();

        voidMessage.message();
        // method does not return any value when it is called == void method

    }
}