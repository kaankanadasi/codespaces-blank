public class exception {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
          }
    }
}


