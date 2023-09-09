package Princeton2;

public class by0 {
    public static void main(String[] args) {
        double x = 17.0/-0.0;
        double y = 17.0/0.0;
        double z = 17.0 % 0.0;
        System.out.println(x + y);
        System.out.println(z);
        
        try {
            int a = 17 / 0;
            int b = 17 % 0;
            System.out.println(a);
            System.out.println(b);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}
