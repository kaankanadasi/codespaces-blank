package Quiz;

public class BankAccount {
    private String accountHolder;
    private double balance;
    
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Kaan Kanadaşı", 50.0);

        System.out.println("Account Holder: " + bankAccount.accountHolder);
        System.out.println("Balance: " + bankAccount.balance);
    }
}
