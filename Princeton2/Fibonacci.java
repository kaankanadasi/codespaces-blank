package Princeton2;

public class Fibonacci {
    public static void main(String[] args) {
        String [] f = new String[10];
        f[0] = "a";
        f[1] = "b";
        for (int i = 2; i < 10; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(f[i]);
        }
    }
}
