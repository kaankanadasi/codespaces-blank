package Princeton2.CarLoan;

public class CarLoan {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Provide three parameters.");
            return;
        }
        /*
        cd /workspaces/codespaces-blank 
        javac Princeton2/CarLoan/CarLoan.java
        java -cp . Princeton2.CarLoan.CarLoan 20000 5 4.5
        */
        double principal = Double.parseDouble(args[0]);
        double years = Double.parseDouble(args[1]);
        double rate = Double.parseDouble(args[2]);

        double r = (rate / 100) / 12;   
        double n = 12 * years;         

        double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
        double interest = payment * n - principal;

        System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
    }

}
