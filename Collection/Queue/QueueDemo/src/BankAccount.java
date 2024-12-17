public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " failed to withdraw: " + amount + ", Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
