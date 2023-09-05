public class functions {
    static class Counter {
        // static variable to old the count
        static int count = 0;

        static void incrementAndPrint () {
            count ++;
            System.out.println("Count:" + count);
        }
        // the function that increments count
    }
    public static void main(String[] args) {
        Counter.incrementAndPrint();
        Counter.incrementAndPrint();
        Counter.incrementAndPrint();

        
    }
}

