public class staticMethod {
    static class MathHelper {
        static int add(int a, int b) {
            return a + b;
        }
    }

    public class Main {
        public static void main(String[] args) {
            int sum = MathHelper.add(a:5, b:3); // Calling static method
            System.out.printIn("Sum: " + sum) ; // Output: Sum: 8  
        }     
    }

}
