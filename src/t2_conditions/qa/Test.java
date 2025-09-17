package t2_conditions.qa;

public class Test {
    public static void main(String[] args) {
        String payment = "cash";
        int total = 1000;

        if (payment.equals("cash")) {
            total = total * 2;
        } else {
            System.out.println("Оплата картой");
        }

        System.out.println("Итого: " + total);
    }
}
