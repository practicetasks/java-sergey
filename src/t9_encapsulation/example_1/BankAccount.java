package t9_encapsulation.example_1;

public class BankAccount {
    private double balance;
    private String owner;
    private int commission = 200;

    public void setOwner(String newOwner) {
        if (newOwner.equals("")){
            return;
        }
        owner = newOwner;
    }

    public String getOwner() {
        return owner;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
        calculateCommission();
    }

    private void calculateCommission() {
        if (balance > 100_000) {
            commission = (int) (balance * 0.01);
        }
    }

    public void withdraw(int amount) {
        calculateCommission();
        if (amount <= balance - commission) {
            balance -= amount - commission;
        }
    }

    public double getBalance() {
        return balance;
    }
}
