package t6_classes_objects.example_2;

public class BankAccount {
    double balance; // 0.0
    String owner;   // null

    void deposit(int amount, String currency) {
        if (amount <= 0) {
            System.out.println("Нельзя пополнять на отрицательную сумму");
            return;
        }

        if (currency.equals("KZT")) {
            balance += amount;
        } else if (currency.equals("USD")) {
            amount *= 500;
            balance += amount;
        }
    }
}
