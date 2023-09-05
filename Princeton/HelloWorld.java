package Princeton;
public class HelloWorld {

    static class Counter {
        static void tenTimes() {
            int x = 0;
            while (x < 10) {
            ++x;
            System.out.println("Hello, world!");          
            }
        }
    }

    public static void main(String[] args) {      
        Counter.tenTimes();
    }

}