class BankAccount {
    private double balance;
    BankAccount(double b) { balance = b; }
    void deposit(double a) { if (a > 0) balance += a; }
    double getBalance() { return balance; }
}
public class OOPThinkingDemo {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(1000);
        a.deposit(250);
        System.out.println(a.getBalance());
    }
}
