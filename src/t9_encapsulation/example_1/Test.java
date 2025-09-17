package t9_encapsulation.example_1;

public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setOwner("Robert");
        bankAccount.setOwner("");
        System.out.println(bankAccount.getOwner());
    }
}
