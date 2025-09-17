package t6_classes_objects.task_1;

public class BankAccount {
    double balance; // 0.0
    String owner;   // null

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Нельзя пополнять на отрицательную сумму");
        }
    }
}
