package t6_classes_objects.example_2;

public class Test {
    public static void main(String[] args) {
        BankAccount firstAccount = new BankAccount();
        firstAccount.owner = "Mike";
//        firstAccount.deposit(15000);

        BankAccount secondAccount = new BankAccount();
        secondAccount.owner = "Jack";

//        firstAccount.transfer(secondAccount, 2000);

        System.out.println(firstAccount.balance); // 13000
        System.out.println(secondAccount.balance); // 2000
    }
}
